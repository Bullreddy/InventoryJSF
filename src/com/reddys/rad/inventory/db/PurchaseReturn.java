/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "purchase_return")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseReturn.findAll", query = "SELECT p FROM PurchaseReturn p"),
    @NamedQuery(name = "PurchaseReturn.findByPurchaseReturnId", query = "SELECT p FROM PurchaseReturn p WHERE p.purchaseReturnId = :purchaseReturnId"),
    @NamedQuery(name = "PurchaseReturn.findByPurchaseReturnDescription", query = "SELECT p FROM PurchaseReturn p WHERE p.purchaseReturnDescription = :purchaseReturnDescription"),
    @NamedQuery(name = "PurchaseReturn.findByPurchaseId", query = "SELECT p FROM PurchaseReturn p WHERE p.purchaseId = :purchaseId"),
    @NamedQuery(name = "PurchaseReturn.findByVendorId", query = "SELECT p FROM PurchaseReturn p WHERE p.vendorId = :vendorId"),
    @NamedQuery(name = "PurchaseReturn.findByRemarks", query = "SELECT p FROM PurchaseReturn p WHERE p.remarks = :remarks"),
    @NamedQuery(name = "PurchaseReturn.findByStatus", query = "SELECT p FROM PurchaseReturn p WHERE p.status = :status"),
    @NamedQuery(name = "PurchaseReturn.findByUserCreated", query = "SELECT p FROM PurchaseReturn p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "PurchaseReturn.findByUserModified", query = "SELECT p FROM PurchaseReturn p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "PurchaseReturn.findByDateCreated", query = "SELECT p FROM PurchaseReturn p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "PurchaseReturn.findByDateModified", query = "SELECT p FROM PurchaseReturn p WHERE p.dateModified = :dateModified")})
public class PurchaseReturn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_RETURN_DETAIL_ID_GENERATOR", sequenceName="purchase_return_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASE_RETURN_DETAIL_ID_GENERATOR")
    @Column(name = "purchase_return_id")
    private String purchaseReturnId;
    @Column(name = "purchase_return_description")
    private String purchaseReturnDescription;
    @Column(name = "purchase_id")
    private String purchaseId;
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "status")
    private String status;
    @Column(name = "user_created")
    private String userCreated;
    @Column(name = "user_modified")
    private String userModified;
    @Column(name = "date_created")
    @Temporal(TemporalType.DATE)
    private Date dateCreated;
    @Column(name = "date_modified")
    @Temporal(TemporalType.DATE)
    private Date dateModified;

    public PurchaseReturn() {
    }

    public PurchaseReturn(String purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
    }

    public String getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(String purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
    }

    public String getPurchaseReturnDescription() {
        return purchaseReturnDescription;
    }

    public void setPurchaseReturnDescription(String purchaseReturnDescription) {
        this.purchaseReturnDescription = purchaseReturnDescription;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public String getUserModified() {
        return userModified;
    }

    public void setUserModified(String userModified) {
        this.userModified = userModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseReturnId != null ? purchaseReturnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseReturn)) {
            return false;
        }
        PurchaseReturn other = (PurchaseReturn) object;
        if ((this.purchaseReturnId == null && other.purchaseReturnId != null) || (this.purchaseReturnId != null && !this.purchaseReturnId.equals(other.purchaseReturnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.PurchaseReturn[ purchaseReturnId=" + purchaseReturnId + " ]";
    }
    
}
