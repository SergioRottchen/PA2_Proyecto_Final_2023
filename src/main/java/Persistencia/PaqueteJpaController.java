/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Pedido;
import Modelo.Almacen;
import Modelo.Paquete;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sirgi
 */
public class PaqueteJpaController implements Serializable {

    public PaqueteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PaqueteJpaController( ) {
    emf = Persistence.createEntityManagerFactory("loginPU");
}
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paquete paquete) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido unPedido = paquete.getUnPedido();
            if (unPedido != null) {
                unPedido = em.getReference(unPedido.getClass(), unPedido.getId());
                paquete.setUnPedido(unPedido);
            }
            Almacen ubicacion = paquete.getUbicacion();
            if (ubicacion != null) {
                ubicacion = em.getReference(ubicacion.getClass(), ubicacion.getId());
                paquete.setUbicacion(ubicacion);
            }
            em.persist(paquete);
            if (unPedido != null) {
                Paquete oldPaquetesOfUnPedido = unPedido.getPaquetes();
                if (oldPaquetesOfUnPedido != null) {
                    oldPaquetesOfUnPedido.setUnPedido(null);
                    oldPaquetesOfUnPedido = em.merge(oldPaquetesOfUnPedido);
                }
                unPedido.setPaquetes(paquete);
                unPedido = em.merge(unPedido);
            }
            if (ubicacion != null) {
                ubicacion.getPaquetes().add(paquete);
                ubicacion = em.merge(ubicacion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paquete paquete) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paquete persistentPaquete = em.find(Paquete.class, paquete.getId());
            Pedido unPedidoOld = persistentPaquete.getUnPedido();
            Pedido unPedidoNew = paquete.getUnPedido();
            Almacen ubicacionOld = persistentPaquete.getUbicacion();
            Almacen ubicacionNew = paquete.getUbicacion();
            if (unPedidoNew != null) {
                unPedidoNew = em.getReference(unPedidoNew.getClass(), unPedidoNew.getId());
                paquete.setUnPedido(unPedidoNew);
            }
            if (ubicacionNew != null) {
                ubicacionNew = em.getReference(ubicacionNew.getClass(), ubicacionNew.getId());
                paquete.setUbicacion(ubicacionNew);
            }
            paquete = em.merge(paquete);
            if (unPedidoOld != null && !unPedidoOld.equals(unPedidoNew)) {
                unPedidoOld.setPaquetes(null);
                unPedidoOld = em.merge(unPedidoOld);
            }
            if (unPedidoNew != null && !unPedidoNew.equals(unPedidoOld)) {
                Paquete oldPaquetesOfUnPedido = unPedidoNew.getPaquetes();
                if (oldPaquetesOfUnPedido != null) {
                    oldPaquetesOfUnPedido.setUnPedido(null);
                    oldPaquetesOfUnPedido = em.merge(oldPaquetesOfUnPedido);
                }
                unPedidoNew.setPaquetes(paquete);
                unPedidoNew = em.merge(unPedidoNew);
            }
            if (ubicacionOld != null && !ubicacionOld.equals(ubicacionNew)) {
                ubicacionOld.getPaquetes().remove(paquete);
                ubicacionOld = em.merge(ubicacionOld);
            }
            if (ubicacionNew != null && !ubicacionNew.equals(ubicacionOld)) {
                ubicacionNew.getPaquetes().add(paquete);
                ubicacionNew = em.merge(ubicacionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = paquete.getId();
                if (findPaquete(id) == null) {
                    throw new NonexistentEntityException("The paquete with id " + id + " no longer exists.");
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
            Paquete paquete;
            try {
                paquete = em.getReference(Paquete.class, id);
                paquete.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paquete with id " + id + " no longer exists.", enfe);
            }
            Pedido unPedido = paquete.getUnPedido();
            if (unPedido != null) {
                unPedido.setPaquetes(null);
                unPedido = em.merge(unPedido);
            }
            Almacen ubicacion = paquete.getUbicacion();
            if (ubicacion != null) {
                ubicacion.getPaquetes().remove(paquete);
                ubicacion = em.merge(ubicacion);
            }
            em.remove(paquete);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paquete> findPaqueteEntities() {
        return findPaqueteEntities(true, -1, -1);
    }

    public List<Paquete> findPaqueteEntities(int maxResults, int firstResult) {
        return findPaqueteEntities(false, maxResults, firstResult);
    }

    private List<Paquete> findPaqueteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paquete.class));
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

    public Paquete findPaquete(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paquete.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaqueteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paquete> rt = cq.from(Paquete.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
