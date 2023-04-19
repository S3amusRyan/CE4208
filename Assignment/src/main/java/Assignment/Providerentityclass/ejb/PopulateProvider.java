/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Assignment.Providerentityclass.ejb;

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
public class PopulateProvider implements PopulateProviderLocal {

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
        Provider c1 = new Provider(205);
        Provider c2 = new Provider(206);
        Provider c3 = new Provider(207);
        Provider c4 = new Provider(208);
        Provider c5 = new Provider(209);
        
        persist(c1);
        persist(c2);
        persist(c3);
        persist(c4);
        persist(c5);
        
        c1.setName("John");
        c2.setName("Paul");
        c3.setName("Katey");
        c4.setName("Harry");
        c5.setName("Rena");
    }
}
