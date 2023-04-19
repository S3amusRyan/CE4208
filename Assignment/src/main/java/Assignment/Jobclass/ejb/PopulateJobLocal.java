/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Assignment.Jobclass.ejb;

import Assignment.Adminclass.ejb.*;
import Assignment.Providerentityclass.ejb.*;
import jakarta.ejb.Local;

/**
 *
 * @author Reine
 */
@Local
public interface PopulateJobLocal {
    public void populate();
}
