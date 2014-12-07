/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author B V Dinesh
 */
@Entity
@Table(name = "sale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sale.findAll", query = "SELECT s FROM Sale s"),
    @NamedQuery(name = "Sale.findBySaleId", query = "SELECT s FROM Sale s WHERE s.saleId = :saleId"),
    @NamedQuery(name = "Sale.findBySaleDescription", query = "SELECT s FROM Sale s WHERE s.saleDescription = :saleDescription"),
    @NamedQuery(name = "Sale.findBySaleDate", query = "SELECT s FROM Sale s WHERE s.saleDate = :saleDate"),
    @NamedQuery(name = "Sale.findBySoldBy", query = "SELECT s FROM Sale s WHERE s.soldBy = :soldBy"),
    @NamedQuery(name = "Sale.findByCustomerId", query = "SELECT s FROM Sale s WHERE s.customerId = :customerId"),
    @NamedQuery(name = "Sale.findByCustomerDetails", query = "SELECT s FROM Sale s WHERE s.customerDetails = :customerDetails"),
    @NamedQuery(name = "Sale.findByBusinessType", query = "SELECT s FROM Sale s WHERE s.businessType = :businessType"),
    @NamedQuery(name = "Sale.findByUserCreated", query = "SELECT s FROM Sale s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "Sale.findByUserModified", query = "SELECT s FROM Sale s WHERE s.userModified = :userModified"),
    @NamedQuery(name = "Sale.findByDateCreated", query = "SELECT s FROM Sale s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "Sale.findByDateModified", query = "SELECT s FROM Sale s WHERE s.dateModified = :dateModified")})
public class Sale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="SALE_SALEID_GENERATOR", sequenceName="sales_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALE_SALEID_GENERATOR")
    @Column(name = "sale_id")
    private String saleId;
    @Column(name = "sale_description")
    private String saleDescription;
    @Column(name = "sale_date")
    @Temporal(TemporalType.DATE)
    private Date saleDate;
    @Column(name = "sold_by")
    private String soldBy;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "customer_details")
    private String customerDetails;
    @Column(name = "business_type")
    private String businessType;
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
    @OneToMany(mappedBy = "saleId")
    private Collection<SaleDetails> saleDetailsCollection;

    public Sale() {
    }

    public Sale(String saleId) {
        this.saleId = saleId;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getSaleDescription() {
        return saleDescription;
    }

    public void setSaleDescription(String saleDescription) {
        this.saleDescription = saleDescription;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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

    @XmlTransient
    public Collection<SaleDetails> getSaleDetailsCollection() {
        return saleDetailsCollection;
    }

    public void setSaleDetailsCollection(Collection<SaleDetails> saleDetailsCollection) {
        this.saleDetailsCollection = saleDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleId != null ? saleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sale)) {
            return false;
        }
        Sale other = (Sale) object;
        if ((this.saleId == null && other.saleId != null) || (this.saleId != null && !this.saleId.equals(other.saleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.Sale[ saleId=" + saleId + " ]";
    }
    
}
