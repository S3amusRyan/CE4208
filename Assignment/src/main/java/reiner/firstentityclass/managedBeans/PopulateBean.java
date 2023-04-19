/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package reiner.firstentityclass.managedBeans;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import reiner.firstentityclass.ejb.PopulateFreelancerLocal;
import Assignment.Providerentityclass.ejb.PopulateProviderLocal;
import Assignment.Adminclass.ejb.PopulateAdminLocal;
import Assignment.Jobclass.ejb.PopulateJobLocal;

/**
 *
 * @author Reine
 */
@Named(value = "populateBean")
@RequestScoped
public class PopulateBean {
    @EJB
    PopulateFreelancerLocal pcl1;
    
    @EJB
    PopulateProviderLocal pcl2;
    
    @EJB
    PopulateAdminLocal pcl3;
    
    @EJB
    PopulateJobLocal pcl4;
    
    
    /**
     * Creates a new instance of PopulateBean
     */
    public PopulateBean() {
    }
    
    public void populate() {
        pcl1.populate();
        pcl2.populate();
        pcl3.populate();
        pcl4.populate();
        
    }
    
}
