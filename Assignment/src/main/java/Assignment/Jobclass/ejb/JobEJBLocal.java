/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Assignment.Jobclass.ejb;

import jakarta.ejb.Local;
import java.util.List;
import reiner.firstentityclass.dbEntities.Job;

/**
 *
 * @author Reine
 */
@Local
public interface JobEJBLocal {
    public List<Job> getAll();
    //public List<Freelancer> findByID(int id);
    //public List<Freelancer> findByName(String name);
    //public List<Freelancer> findByAddress(int address);
}


