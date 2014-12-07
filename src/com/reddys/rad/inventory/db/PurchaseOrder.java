/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author REDDYS
 */
@Entity
@Table(name = "purchase_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseOrder.findAll", query = "SELECT p FROM PurchaseOrder p"),
    @NamedQuery(name = "PurchaseOrder.findByPurchaseOrderId", query = "SELECT p FROM PurchaseOrder p WHERE p.purchaseOrderId = :purchaseOrderId"),
    @NamedQuery(name = "PurchaseOrder.findByPurchaseOrderDescription", query = "SELECT p FROM PurchaseOrder p WHERE p.purchaseOrderDescription = :purchaseOrderDescription"),
    @NamedQuery(name = "PurchaseOrder.findByPurchaseOrderDate", query = "SELECT p FROM PurchaseOrder p WHERE p.purchaseOrderDate = :purchaseOrderDate"),
    @NamedQuery(name = "PurchaseOrder.findByVendorOrderNo", query = "SELECT p FROM PurchaseOrder p WHERE p.vendorOrderNo = :vendorOrderNo"),
    @NamedQuery(name = "PurchaseOrder.findByVendorLocation", query = "SELECT p FROM PurchaseOrder p WHERE p.vendorLocation = :vendorLocation"),
    @NamedQuery(name = "PurchaseOrder.findByRequestedShipDate", query = "SELECT p FROM PurchaseOrder p WHERE p.requestedShipDate = :requestedShipDate"),
    @NamedQuery(name = "PurchaseOrder.findByDueDate", query = "SELECT p FROM PurchaseOrder p WHERE p.dueDate = :dueDate"),
    @NamedQuery(name = "PurchaseOrder.findByTotalAmount", query = "SELECT p FROM PurchaseOrder p WHERE p.totalAmount = :totalAmount"),
    @NamedQuery(name = "PurchaseOrder.findByPaid", query = "SELECT p FROM PurchaseOrder p WHERE p.paid = :paid"),
    @NamedQuery(name = "PurchaseOrder.findByBalanceAmount", query = "SELECT p FROM PurchaseOrder p WHERE p.balanceAmount = :balanceAmount"),
    @NamedQuery(name = "PurchaseOrder.findByUserCreated", query = "SELECT p FROM PurchaseOrder p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "PurchaseOrder.findByUserModified", query = "SELECT p FROM PurchaseOrder p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "PurchaseOrder.findByDateCreated", query = "SELECT p FROM PurchaseOrder p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "PurchaseOrder.findByDateModified", query = "SELECT p FROM PurchaseOrder p WHERE p.dateModified = :dateModified")})
public class PurchaseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_ORDER_PURCHASEORDERID_GENERATOR", sequenceName="PURCHASE_ORDER_SEQUENCE",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASE_ORDER_PURCHASEORDERID_GENERATOR")
    @Column(name = "purchase_order_id")
    private String purchaseOrderId;
    @Column(name = "purchase_order_description")
    private String purchaseOrderDescription;
    @Column(name = "purchase_order_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseOrderDate;
    @Column(name = "vendor_order_no")
    private String vendorOrderNo;
    @Column(name = "vendor_location")
    private String vendorLocation;
    @Column(name = "requested_ship_date")
    @Temporal(TemporalType.DATE)
    private Date requestedShipDate;
    @Column(name = "due_date")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "paid")
    private Double paid;
    @Column(name = "balance_amount")
    private Double balanceAmount;
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
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "status")
    private String status;

    public PurchaseOrder() {
    }

    public PurchaseOrder(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderDescription() {
        return purchaseOrderDescription;
    }

    public void setPurchaseOrderDescription(String purchaseOrderDescription) {
        this.purchaseOrderDescription = purchaseOrderDescription;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate(Date purchaseOrderDate) {
        this.purchaseOrderDate = purchaseOrderDate;
    }

    public String getVendorOrderNo() {
        return vendorOrderNo;
    }

    public void setVendorOrderNo(String vendorOrderNo) {
        this.vendorOrderNo = vendorOrderNo;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public Date getRequestedShipDate() {
        return requestedShipDate;
    }

    public void setRequestedShipDate(Date requestedShipDate) {
        this.requestedShipDate = requestedShipDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
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

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseOrderId != null ? purchaseOrderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrder)) {
            return false;
        }
        PurchaseOrder other = (PurchaseOrder) object;
        if ((this.purchaseOrderId == null && other.purchaseOrderId != null) || (this.purchaseOrderId != null && !this.purchaseOrderId.equals(other.purchaseOrderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return purchaseOrderId;
    }


}
