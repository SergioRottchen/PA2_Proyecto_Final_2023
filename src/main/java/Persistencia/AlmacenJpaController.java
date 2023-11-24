/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Almacen;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Paquete;
import java.util.ArrayList;
import java.util.List;
import Modelo.Proveedor;
import Persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sirgi
 */
public class AlmacenJpaController implements Serializable {

    public AlmacenJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public AlmacenJpaController( ) {
    emf = Persistence.createEntityManagerFactory("loginPU");
}
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Almacen almacen) {
        if (almacen.getPaquetes() == null) {
            almacen.setPaquetes(new ArrayList<Paquete>());
        }
        if (almacen.getProveedores() == null) {
            almacen.setProveedores(new ArrayList<Proveedor>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paquete> attachedPaquetes = new ArrayList<Paquete>();
            for (Paquete paquetesPaqueteToAttach : almacen.getPaquetes()) {
                paquetesPaqueteToAttach = em.getReference(paquetesPaqueteToAttach.getClass(), paquetesPaqueteToAttach.getId());
                attachedPaquetes.add(paquetesPaqueteToAttach);
            }
            almacen.setPaquetes(attachedPaquetes);
            List<Proveedor> attachedProveedores = new ArrayList<Proveedor>();
            for (Proveedor proveedoresProveedorToAttach : almacen.getProveedores()) {
                proveedoresProveedorToAttach = em.getReference(proveedoresProveedorToAttach.getClass(), proveedoresProveedorToAttach.getId());
                attachedProveedores.add(proveedoresProveedorToAttach);
            }
            almacen.setProveedores(attachedProveedores);
            em.persist(almacen);
            for (Paquete paquetesPaquete : almacen.getPaquetes()) {
                Almacen oldUbicacionOfPaquetesPaquete = paquetesPaquete.getUbicacion();
                paquetesPaquete.setUbicacion(almacen);
                paquetesPaquete = em.merge(paquetesPaquete);
                if (oldUbicacionOfPaquetesPaquete != null) {
                    oldUbicacionOfPaquetesPaquete.getPaquetes().remove(paquetesPaquete);
                    oldUbicacionOfPaquetesPaquete = em.merge(oldUbicacionOfPaquetesPaquete);
                }
            }
            for (Proveedor proveedoresProveedor : almacen.getProveedores()) {
                Almacen oldUnAlmacenOfProveedoresProveedor = proveedoresProveedor.getUnAlmacen();
                proveedoresProveedor.setUnAlmacen(almacen);
                proveedoresProveedor = em.merge(proveedoresProveedor);
                if (oldUnAlmacenOfProveedoresProveedor != null) {
                    oldUnAlmacenOfProveedoresProveedor.getProveedores().remove(proveedoresProveedor);
                    oldUnAlmacenOfProveedoresProveedor = em.merge(oldUnAlmacenOfProveedoresProveedor);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Almacen almacen) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Almacen persistentAlmacen = em.find(Almacen.class, almacen.getId());
            List<Paquete> paquetesOld = persistentAlmacen.getPaquetes();
            List<Paquete> paquetesNew = almacen.getPaquetes();
            List<Proveedor> proveedoresOld = persistentAlmacen.getProveedores();
            List<Proveedor> proveedoresNew = almacen.getProveedores();
            List<Paquete> attachedPaquetesNew = new ArrayList<Paquete>();
            for (Paquete paquetesNewPaqueteToAttach : paquetesNew) {
                paquetesNewPaqueteToAttach = em.getReference(paquetesNewPaqueteToAttach.getClass(), paquetesNewPaqueteToAttach.getId());
                attachedPaquetesNew.add(paquetesNewPaqueteToAttach);
            }
            paquetesNew = attachedPaquetesNew;
            almacen.setPaquetes(paquetesNew);
            List<Proveedor> attachedProveedoresNew = new ArrayList<Proveedor>();
            for (Proveedor proveedoresNewProveedorToAttach : proveedoresNew) {
                proveedoresNewProveedorToAttach = em.getReference(proveedoresNewProveedorToAttach.getClass(), proveedoresNewProveedorToAttach.getId());
                attachedProveedoresNew.add(proveedoresNewProveedorToAttach);
            }
            proveedoresNew = attachedProveedoresNew;
            almacen.setProveedores(proveedoresNew);
            almacen = em.merge(almacen);
            for (Paquete paquetesOldPaquete : paquetesOld) {
                if (!paquetesNew.contains(paquetesOldPaquete)) {
                    paquetesOldPaquete.setUbicacion(null);
                    paquetesOldPaquete = em.merge(paquetesOldPaquete);
                }
            }
            for (Paquete paquetesNewPaquete : paquetesNew) {
                if (!paquetesOld.contains(paquetesNewPaquete)) {
                    Almacen oldUbicacionOfPaquetesNewPaquete = paquetesNewPaquete.getUbicacion();
                    paquetesNewPaquete.setUbicacion(almacen);
                    paquetesNewPaquete = em.merge(paquetesNewPaquete);
                    if (oldUbicacionOfPaquetesNewPaquete != null && !oldUbicacionOfPaquetesNewPaquete.equals(almacen)) {
                        oldUbicacionOfPaquetesNewPaquete.getPaquetes().remove(paquetesNewPaquete);
                        oldUbicacionOfPaquetesNewPaquete = em.merge(oldUbicacionOfPaquetesNewPaquete);
                    }
                }
            }
            for (Proveedor proveedoresOldProveedor : proveedoresOld) {
                if (!proveedoresNew.contains(proveedoresOldProveedor)) {
                    proveedoresOldProveedor.setUnAlmacen(null);
                    proveedoresOldProveedor = em.merge(proveedoresOldProveedor);
                }
            }
            for (Proveedor proveedoresNewProveedor : proveedoresNew) {
                if (!proveedoresOld.contains(proveedoresNewProveedor)) {
                    Almacen oldUnAlmacenOfProveedoresNewProveedor = proveedoresNewProveedor.getUnAlmacen();
                    proveedoresNewProveedor.setUnAlmacen(almacen);
                    proveedoresNewProveedor = em.merge(proveedoresNewProveedor);
                    if (oldUnAlmacenOfProveedoresNewProveedor != null && !oldUnAlmacenOfProveedoresNewProveedor.equals(almacen)) {
                        oldUnAlmacenOfProveedoresNewProveedor.getProveedores().remove(proveedoresNewProveedor);
                        oldUnAlmacenOfProveedoresNewProveedor = em.merge(oldUnAlmacenOfProveedoresNewProveedor);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = almacen.getId();
                if (findAlmacen(id) == null) {
                    throw new NonexistentEntityException("The almacen with id " + id + " no longer exists.");
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
            Almacen almacen;
            try {
                almacen = em.getReference(Almacen.class, id);
                almacen.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The almacen with id " + id + " no longer exists.", enfe);
            }
            List<Paquete> paquetes = almacen.getPaquetes();
            for (Paquete paquetesPaquete : paquetes) {
                paquetesPaquete.setUbicacion(null);
                paquetesPaquete = em.merge(paquetesPaquete);
            }
            List<Proveedor> proveedores = almacen.getProveedores();
            for (Proveedor proveedoresProveedor : proveedores) {
                proveedoresProveedor.setUnAlmacen(null);
                proveedoresProveedor = em.merge(proveedoresProveedor);
            }
            em.remove(almacen);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Almacen> findAlmacenEntities() {
        return findAlmacenEntities(true, -1, -1);
    }

    public List<Almacen> findAlmacenEntities(int maxResults, int firstResult) {
        return findAlmacenEntities(false, maxResults, firstResult);
    }

    private List<Almacen> findAlmacenEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Almacen.class));
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

    public Almacen findAlmacen(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Almacen.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlmacenCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Almacen> rt = cq.from(Almacen.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
