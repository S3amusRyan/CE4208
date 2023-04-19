/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reiner.firstentityclass.dbEntities;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Reine
 */
@Entity
@Table(name = "JOB")
@NamedQueries({
      @NamedQuery(name = "Job.getAll", query = "SELECT c FROM Job c")})
//    @NamedQuery(name = "Freelancer.findById", query = "SELECT c FROM Freelancer c WHERE c.id = :id"),
//    @NamedQuery(name = "Freelancer.findByName", query = "SELECT c FROM Freelancer c WHERE c.name = :name"),
//    @NamedQuery(name = "Freelancer.findByAddress", query = "SELECT c FROM Freelancer c WHERE c.address = :address")})

public class Job {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JOBID")
    private Integer id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "OWNERID")
    private Integer ownerid;
    @Column(name = "PAYMENT")
    private Integer payment;
    @Column(name = "STATUS")
    private String status;

    public Job() {
    }

    public Job(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Job)) {
            return false;
        }
        Job other = (Job) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reiner.firstentityclass.dbEntities.Customer123456789[ id=" + id + " ]";
    }
}
