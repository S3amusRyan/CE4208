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
@Table(name = "FREELANCERS")
@NamedQueries({
      @NamedQuery(name = "Freelancer.getAll", query = "SELECT c FROM Freelancer c")})
//    @NamedQuery(name = "Freelancer.findById", query = "SELECT c FROM Freelancer c WHERE c.id = :id"),
//    @NamedQuery(name = "Freelancer.findByName", query = "SELECT c FROM Freelancer c WHERE c.name = :name"),
//    @NamedQuery(name = "Freelancer.findByAddress", query = "SELECT c FROM Freelancer c WHERE c.address = :address")})
public class Freelancer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BALANCE")
    private Integer balance;

    public Freelancer() {
    }

    public Freelancer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Freelancer)) {
            return false;
        }
        Freelancer other = (Freelancer) object;
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
