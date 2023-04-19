/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package reiner.firstentityclass.managedBeans;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;
//import reiner.firstentityclass.dbEntities.Freelancer;
//import reiner.firstentityclass.ejb.CustomerEJBLocal;
import reiner.firstentityclass.dbEntities.Job;
import Assignment.Jobclass.ejb.JobEJBLocal;

/**
 *
 * @author Reine
 */
@Named(value = "interactBean")
@RequestScoped
public class InteractBean {

    private int id;
    private String title;
    private String description;
    private int ownerid;
    private int payment;
    private String status;

    @EJB
    JobEJBLocal cejb;
    
    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the value of ownerid
     *
     * @return the value of ownerid
     */
    public Integer getOwnerid() {
        return ownerid;
    }

    /**
     * Set the value of ownerid
     *
     * @param ownerid new value of ownerid
     */
    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    /**
     * Get the value of payment
     *
     * @return the value of payment
     */
    public int getPayment() {
        return payment;
    }

    /**
     * Set the value of payment
     *
     * @param payment new value of payment
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public List<Job> getAll() {
        return cejb.getAll();
    }
    
    
/*    
    public List<Freelancer> getByID() {
        return cejb.findByID(id);
    }
    
    public List<Freelancer> getByName() {
        return cejb.findByName(name);
    }
    
    public List<Freelancer> getByAddress() {
        return cejb.findByAddress(balance);
    }
    */
    /**
     * Creates a new instance of InteractBean
     */
    public InteractBean() {
    }

}
