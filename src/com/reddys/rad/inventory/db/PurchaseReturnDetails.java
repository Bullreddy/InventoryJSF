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
@Table(name = "purchase_return_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseReturnDetails.findAll", query = "SELECT p FROM PurchaseReturnDetails p"),
    @NamedQuery(name = "PurchaseReturnDetails.findByPurchaseReturnDetailId", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.purchaseReturnDetailId = :purchaseReturnDetailId"),
    @NamedQuery(name = "PurchaseReturnDetails.findByPurchaseReturnDetailsDescription", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.purchaseReturnDetailsDescription = :purchaseReturnDetailsDescription"),
    @NamedQuery(name = "PurchaseReturnDetails.findByPurchaseReturnId", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.purchaseReturnId = :purchaseReturnId"),
    @NamedQuery(name = "PurchaseReturnDetails.findByProductId", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.productId = :productId"),
    @NamedQuery(name = "PurchaseReturnDetails.findByProductCategoryId", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.productCategoryId = :productCategoryId"),
    @NamedQuery(name = "PurchaseReturnDetails.findByQuantityReceived", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.quantityReceived = :quantityReceived"),
    @NamedQuery(name = "PurchaseReturnDetails.findByQuantityRejected", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.quantityRejected = :quantityRejected"),
    @NamedQuery(name = "PurchaseReturnDetails.findByUom", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.uom = :uom"),
    @NamedQuery(name = "PurchaseReturnDetails.findByRejectedRemarks", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.rejectedRemarks = :rejectedRemarks"),
    @NamedQuery(name = "PurchaseReturnDetails.findByStatus", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.status = :status"),
    @NamedQuery(name = "PurchaseReturnDetails.findByUserCreated", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "PurchaseReturnDetails.findByUserModified", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "PurchaseReturnDetails.findByDateCreated", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "PurchaseReturnDetails.findByDateModified", query = "SELECT p FROM PurchaseReturnDetails p WHERE p.dateModified = :dateModified")})
public class PurchaseReturnDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_RETURN_ID_GENERATOR", sequenceName="purchase_return_details_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASE_RETURN_ID_GENERATOR")
    @Column(name = "purchase_return_detail_id")
    private String purchaseReturnDetailId;
    @Column(name = "purchase_return_details_description")
    private String purchaseReturnDetailsDescription;
    @Column(name = "purchase_return_id")
    private String purchaseReturnId;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_category_id")
    private String productCategoryId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity_received")
    private Double quantityReceived;
    @Column(name = "quantity_rejected")
    private Double quantityRejected;
    @Column(name = "uom")
    private String uom;
    @Column(name = "rejected_remarks")
    private String rejectedRemarks;
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

    public PurchaseReturnDetails() {
    }

    public PurchaseReturnDetails(String purchaseReturnDetailId) {
        this.purchaseReturnDetailId = purchaseReturnDetailId;
    }

    public String getPurchaseReturnDetailId() {
        return purchaseReturnDetailId;
    }

    public void setPurchaseReturnDetailId(String purchaseReturnDetailId) {
        this.purchaseReturnDetailId = purchaseReturnDetailId;
    }

    public String getPurchaseReturnDetailsDescription() {
        return purchaseReturnDetailsDescription;
    }

    public void setPurchaseReturnDetailsDescription(String purchaseReturnDetailsDescription) {
        this.purchaseReturnDetailsDescription = purchaseReturnDetailsDescription;
    }

    public String getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(String purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Double getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Double getQuantityRejected() {
        return quantityRejected;
    }

    public void setQuantityRejected(Double quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getRejectedRemarks() {
        return rejectedRemarks;
    }

    public void setRejectedRemarks(String rejectedRemarks) {
        this.rejectedRemarks = rejectedRemarks;
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
        hash += (purchaseReturnDetailId != null ? purchaseReturnDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseReturnDetails)) {
            return false;
        }
        PurchaseReturnDetails other = (PurchaseReturnDetails) object;
        if ((this.purchaseReturnDetailId == null && other.purchaseReturnDetailId != null) || (this.purchaseReturnDetailId != null && !this.purchaseReturnDetailId.equals(other.purchaseReturnDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.PurchaseReturnDetails[ purchaseReturnDetailId=" + purchaseReturnDetailId + " ]";
    }
    
}
