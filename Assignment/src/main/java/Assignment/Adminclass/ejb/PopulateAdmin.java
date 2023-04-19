/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Assignment.Adminclass.ejb;

import Assignment.Providerentityclass.ejb.*;
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
public class PopulateAdmin implements PopulateAdminLocal {

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
        Admin c1 = new Admin(19254555);

        persist(c1);
 
        c1.setName("Seamus");

    }
}
