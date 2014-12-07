/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author B V Dinesh
 */
@Entity
@Table(name = "sales_return")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReturn.findAll", query = "SELECT s FROM SalesReturn s"),
    @NamedQuery(name = "SalesReturn.findBySaleReturnId", query = "SELECT s FROM SalesReturn s WHERE s.saleReturnId = :saleReturnId"),
    @NamedQuery(name = "SalesReturn.findBySaleReturnDescription", query = "SELECT s FROM SalesReturn s WHERE s.saleReturnDescription = :saleReturnDescription"),
    @NamedQuery(name = "SalesReturn.findBySaleReturnDate", query = "SELECT s FROM SalesReturn s WHERE s.saleReturnDate = :saleReturnDate"),
    @NamedQuery(name = "SalesReturn.findByReturnedBy", query = "SELECT s FROM SalesReturn s WHERE s.returnedBy = :returnedBy"),
    @NamedQuery(name = "SalesReturn.findBySaleId", query = "SELECT s FROM SalesReturn s WHERE s.saleId = :saleId"),
    @NamedQuery(name = "SalesReturn.findByCustomerId", query = "SELECT s FROM SalesReturn s WHERE s.customerId = :customerId"),
    @NamedQuery(name = "SalesReturn.findByCustomerDetails", query = "SELECT s FROM SalesReturn s WHERE s.customerDetails = :customerDetails"),
    @NamedQuery(name = "SalesReturn.findByQuantityReturned", query = "SELECT s FROM SalesReturn s WHERE s.quantityReturned = :quantityReturned"),
    @NamedQuery(name = "SalesReturn.findByBusinessType", query = "SELECT s FROM SalesReturn s WHERE s.businessType = :businessType"),
    @NamedQuery(name = "SalesReturn.findByUserCreated", query = "SELECT s FROM SalesReturn s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "SalesReturn.findByUserModified", query = "SELECT s FROM SalesReturn s WHERE s.userModified = :userModified"),
    @NamedQuery(name = "SalesReturn.findByDateCreated", query = "SELECT s FROM SalesReturn s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "SalesReturn.findByDateModified", query = "SELECT s FROM SalesReturn s WHERE s.dateModified = :dateModified")})
public class SalesReturn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="SALE_RETURN_SALERETURNID_GENERATOR", sequenceName="sales_return_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALE_RETURN_SALERETURNID_GENERATOR")
    @Column(name = "sale_return_id")
    private String saleReturnId;
    @Column(name = "sale_return_description")
    private String saleReturnDescription;
    @Column(name = "sale_return_date")
    @Temporal(TemporalType.DATE)
    private Date saleReturnDate;
    @Column(name = "returned_by")
    private String returnedBy;
    @Column(name = "sale_id")
    private String saleId;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "customer_details")
    private String customerDetails;
    @Column(name = "quantity_returned")
    private BigInteger quantityReturned;
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

    public SalesReturn() {
    }

    public SalesReturn(String saleReturnId) {
        this.saleReturnId = saleReturnId;
    }

    public String getSaleReturnId() {
        return saleReturnId;
    }

    public void setSaleReturnId(String saleReturnId) {
        this.saleReturnId = saleReturnId;
    }

    public String getSaleReturnDescription() {
        return saleReturnDescription;
    }

    public void setSaleReturnDescription(String saleReturnDescription) {
        this.saleReturnDescription = saleReturnDescription;
    }

    public Date getSaleReturnDate() {
        return saleReturnDate;
    }

    public void setSaleReturnDate(Date saleReturnDate) {
        this.saleReturnDate = saleReturnDate;
    }

    public String getReturnedBy() {
        return returnedBy;
    }

    public void setReturnedBy(String returnedBy) {
        this.returnedBy = returnedBy;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
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

    public BigInteger getQuantityReturned() {
        return quantityReturned;
    }

    public void setQuantityReturned(BigInteger quantityReturned) {
        this.quantityReturned = quantityReturned;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleReturnId != null ? saleReturnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReturn)) {
            return false;
        }
        SalesReturn other = (SalesReturn) object;
        if ((this.saleReturnId == null && other.saleReturnId != null) || (this.saleReturnId != null && !this.saleReturnId.equals(other.saleReturnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.SalesReturn[ saleReturnId=" + saleReturnId + " ]";
    }
    
}
