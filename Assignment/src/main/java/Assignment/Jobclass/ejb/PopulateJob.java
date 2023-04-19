/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Assignment.Jobclass.ejb;

import Assignment.Adminclass.ejb.*;
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
public class PopulateJob implements PopulateJobLocal {

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
        Job c1 = new Job(1);

        persist(c1);
 
        c1.setTitle("Cleaning");
        
        c1.setDescription("Cleaning the frontdrive of house");
        
        c1.setOwnerid(205);
        
        c1.setPayment(100);
        
        c1.setStatus("OPEN");

    }
}
