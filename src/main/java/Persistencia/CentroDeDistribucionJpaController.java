/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.CentroDeDistribucion;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Paquete;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sirgi
 */
public class CentroDeDistribucionJpaController implements Serializable {

    public CentroDeDistribucionJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public CentroDeDistribucionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CentroDeDistribucion centroDeDistribucion) {
        if (centroDeDistribucion.getPaquetes() == null) {
            centroDeDistribucion.setPaquetes(new ArrayList<Paquete>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paquete> attachedPaquetes = new ArrayList<Paquete>();
            for (Paquete paquetesPaqueteToAttach : centroDeDistribucion.getPaquetes()) {
                paquetesPaqueteToAttach = em.getReference(paquetesPaqueteToAttach.getClass(), paquetesPaqueteToAttach.getId());
                attachedPaquetes.add(paquetesPaqueteToAttach);
            }
            centroDeDistribucion.setPaquetes(attachedPaquetes);
            em.persist(centroDeDistribucion);
            for (Paquete paquetesPaquete : centroDeDistribucion.getPaquetes()) {
                Modelo.Almacen oldUbicacionOfPaquetesPaquete = paquetesPaquete.getUbicacion();
                paquetesPaquete.setUbicacion(centroDeDistribucion);
                paquetesPaquete = em.merge(paquetesPaquete);
                if (oldUbicacionOfPaquetesPaquete != null) {
                    oldUbicacionOfPaquetesPaquete.getPaquetes().remove(paquetesPaquete);
                    oldUbicacionOfPaquetesPaquete = em.merge(oldUbicacionOfPaquetesPaquete);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CentroDeDistribucion centroDeDistribucion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CentroDeDistribucion persistentCentroDeDistribucion = em.find(CentroDeDistribucion.class, centroDeDistribucion.getId());
            List<Paquete> paquetesOld = persistentCentroDeDistribucion.getPaquetes();
            List<Paquete> paquetesNew = centroDeDistribucion.getPaquetes();
            List<Paquete> attachedPaquetesNew = new ArrayList<Paquete>();
            for (Paquete paquetesNewPaqueteToAttach : paquetesNew) {
                paquetesNewPaqueteToAttach = em.getReference(paquetesNewPaqueteToAttach.getClass(), paquetesNewPaqueteToAttach.getId());
                attachedPaquetesNew.add(paquetesNewPaqueteToAttach);
            }
            paquetesNew = attachedPaquetesNew;
            centroDeDistribucion.setPaquetes(paquetesNew);
            centroDeDistribucion = em.merge(centroDeDistribucion);
            for (Paquete paquetesOldPaquete : paquetesOld) {
                if (!paquetesNew.contains(paquetesOldPaquete)) {
                    paquetesOldPaquete.setUbicacion(null);
                    paquetesOldPaquete = em.merge(paquetesOldPaquete);
                }
            }
            for (Paquete paquetesNewPaquete : paquetesNew) {
                if (!paquetesOld.contains(paquetesNewPaquete)) {
                    CentroDeDistribucion oldUbicacionOfPaquetesNewPaquete = (CentroDeDistribucion) paquetesNewPaquete.getUbicacion();
                    paquetesNewPaquete.setUbicacion(centroDeDistribucion);
                    paquetesNewPaquete = em.merge(paquetesNewPaquete);
                    if (oldUbicacionOfPaquetesNewPaquete != null && !oldUbicacionOfPaquetesNewPaquete.equals(centroDeDistribucion)) {
                        oldUbicacionOfPaquetesNewPaquete.getPaquetes().remove(paquetesNewPaquete);
                        oldUbicacionOfPaquetesNewPaquete = em.merge(oldUbicacionOfPaquetesNewPaquete);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = centroDeDistribucion.getId();
                if (findCentroDeDistribucion(id) == null) {
                    throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CentroDeDistribucion centroDeDistribucion;
            try {
                centroDeDistribucion = em.getReference(CentroDeDistribucion.class, id);
                centroDeDistribucion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.", enfe);
            }
            List<Paquete> paquetes = centroDeDistribucion.getPaquetes();
            for (Paquete paquetesPaquete : paquetes) {
                paquetesPaquete.setUbicacion(null);
                paquetesPaquete = em.merge(paquetesPaquete);
            }
            em.remove(centroDeDistribucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities() {
        return findCentroDeDistribucionEntities(true, -1, -1);
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities(int maxResults, int firstResult) {
        return findCentroDeDistribucionEntities(false, maxResults, firstResult);
    }

    private List<CentroDeDistribucion> findCentroDeDistribucionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CentroDeDistribucion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public CentroDeDistribucion findCentroDeDistribucion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CentroDeDistribucion.class, id);
        } finally {
            em.close();
        }
    }

    public int getCentroDeDistribucionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CentroDeDistribucion> rt = cq.from(CentroDeDistribucion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
