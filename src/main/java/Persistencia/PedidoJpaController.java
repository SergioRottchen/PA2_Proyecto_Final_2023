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
import Modelo.DocumentoTransporte;
import Modelo.Paquete;
import Modelo.Pedido;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sirgi
 */
public class PedidoJpaController implements Serializable {

    public PedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PedidoJpaController( ) {
    emf = Persistence.createEntityManagerFactory("loginPU");
}
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pedido pedido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DocumentoTransporte unDocumento = pedido.getUnDocumento();
            if (unDocumento != null) {
                unDocumento = em.getReference(unDocumento.getClass(), unDocumento.getId());
                pedido.setUnDocumento(unDocumento);
            }
            Paquete paquetes = pedido.getPaquetes();
            if (paquetes != null) {
                paquetes = em.getReference(paquetes.getClass(), paquetes.getId());
                pedido.setPaquetes(paquetes);
            }
            em.persist(pedido);
            if (unDocumento != null) {
                unDocumento.getPedidos().add(pedido);
                unDocumento = em.merge(unDocumento);
            }
            if (paquetes != null) {
                Pedido oldUnPedidoOfPaquetes = paquetes.getUnPedido();
                if (oldUnPedidoOfPaquetes != null) {
                    oldUnPedidoOfPaquetes.setPaquetes(null);
                    oldUnPedidoOfPaquetes = em.merge(oldUnPedidoOfPaquetes);
                }
                paquetes.setUnPedido(pedido);
                paquetes = em.merge(paquetes);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pedido pedido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido persistentPedido = em.find(Pedido.class, pedido.getId());
            DocumentoTransporte unDocumentoOld = persistentPedido.getUnDocumento();
            DocumentoTransporte unDocumentoNew = pedido.getUnDocumento();
            Paquete paquetesOld = persistentPedido.getPaquetes();
            Paquete paquetesNew = pedido.getPaquetes();
            if (unDocumentoNew != null) {
                unDocumentoNew = em.getReference(unDocumentoNew.getClass(), unDocumentoNew.getId());
                pedido.setUnDocumento(unDocumentoNew);
            }
            if (paquetesNew != null) {
                paquetesNew = em.getReference(paquetesNew.getClass(), paquetesNew.getId());
                pedido.setPaquetes(paquetesNew);
            }
            pedido = em.merge(pedido);
            if (unDocumentoOld != null && !unDocumentoOld.equals(unDocumentoNew)) {
                unDocumentoOld.getPedidos().remove(pedido);
                unDocumentoOld = em.merge(unDocumentoOld);
            }
            if (unDocumentoNew != null && !unDocumentoNew.equals(unDocumentoOld)) {
                unDocumentoNew.getPedidos().add(pedido);
                unDocumentoNew = em.merge(unDocumentoNew);
            }
            if (paquetesOld != null && !paquetesOld.equals(paquetesNew)) {
                paquetesOld.setUnPedido(null);
                paquetesOld = em.merge(paquetesOld);
            }
            if (paquetesNew != null && !paquetesNew.equals(paquetesOld)) {
                Pedido oldUnPedidoOfPaquetes = paquetesNew.getUnPedido();
                if (oldUnPedidoOfPaquetes != null) {
                    oldUnPedidoOfPaquetes.setPaquetes(null);
                    oldUnPedidoOfPaquetes = em.merge(oldUnPedidoOfPaquetes);
                }
                paquetesNew.setUnPedido(pedido);
                paquetesNew = em.merge(paquetesNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pedido.getId();
                if (findPedido(id) == null) {
                    throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.");
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
            Pedido pedido;
            try {
                pedido = em.getReference(Pedido.class, id);
                pedido.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.", enfe);
            }
            DocumentoTransporte unDocumento = pedido.getUnDocumento();
            if (unDocumento != null) {
                unDocumento.getPedidos().remove(pedido);
                unDocumento = em.merge(unDocumento);
            }
            Paquete paquetes = pedido.getPaquetes();
            if (paquetes != null) {
                paquetes.setUnPedido(null);
                paquetes = em.merge(paquetes);
            }
            em.remove(pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pedido> findPedidoEntities() {
        return findPedidoEntities(true, -1, -1);
    }

    public List<Pedido> findPedidoEntities(int maxResults, int firstResult) {
        return findPedidoEntities(false, maxResults, firstResult);
    }

    private List<Pedido> findPedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pedido.class));
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

    public Pedido findPedido(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pedido> rt = cq.from(Pedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
