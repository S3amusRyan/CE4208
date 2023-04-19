/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package reiner.firstentityclass.ejb;

import jakarta.ejb.Stateless;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import reiner.firstentityclass.dbEntities.Freelancer;

/**
 *
 * @author Reine
 */
@Stateless
public class CustomerEJB implements CustomerEJBLocal {

    @PersistenceContext(unitName = "Reiner_Ex8-3-FirstEntityClass_war_1.0PU")
    private EntityManager em;

    @Override
    public List<Freelancer> getAll() {
        Query q = em.createNamedQuery("Freelancer.getAll");
        return q.getResultList();
    }
/*
    @Override
    public List<Freelancer> findByID(int id) {
        Query q = em.createNamedQuery("Customer123456789.findById");
        q.setParameter("id", id);
        return q.getResultList();
    }

    @Override
    public List<Freelancer> findByName(String name) {
        Query q = em.createNamedQuery("Customer123456789.findByName");
        q.setParameter("name", name);
        return q.getResultList();
    }

    @Override
    public List<Freelancer> findByAddress(String address) {
        Query q = em.createNamedQuery("Customer123456789.findByAddress");
        q.setParameter("address", address);
        return q.getResultList();
    }
*/
    public void persist(Object object) {
        try {
            //utx.begin();
            em.persist(object);
            //utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
}

