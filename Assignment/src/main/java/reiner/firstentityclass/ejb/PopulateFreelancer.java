/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package reiner.firstentityclass.ejb;

import jakarta.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import reiner.firstentityclass.dbEntities.*;

/**
 *
 * @author Reine
 */
@Stateless
public class PopulateFreelancer implements PopulateFreelancerLocal {

    @PersistenceContext(unitName = "Reiner_Ex8-3-FirstEntityClass_war_1.0PU")
    private EntityManager em;

    public void persist(Object object) {
        try {
            em.persist(object);
           
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void populate() {
        Freelancer c1 = new Freelancer(105);
        Freelancer c2 = new Freelancer(106);
        Freelancer c3 = new Freelancer(107);
        Freelancer c4 = new Freelancer(108);
        
        persist(c1);
        persist(c2);
        persist(c3);
        persist(c4);
        
        c1.setName("Anne");
        c2.setName("Marty");
        c3.setName("Siobhan");
        c4.setName("Kieran");
        
        
        c1.setBalance(103);
        c2.setBalance(300);
        c3.setBalance(1950);
        c4.setBalance(22);
 
    }

    
}
