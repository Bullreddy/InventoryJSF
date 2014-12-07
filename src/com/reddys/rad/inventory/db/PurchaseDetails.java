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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "purchase_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseDetails.findAll", query = "SELECT p FROM PurchaseDetails p"),
    @NamedQuery(name = "PurchaseDetails.findByPurchaseDetailsId", query = "SELECT p FROM PurchaseDetails p WHERE p.purchaseDetailsId = :purchaseDetailsId"),
    @NamedQuery(name = "PurchaseDetails.findByPurchaseDetailsDescription", query = "SELECT p FROM PurchaseDetails p WHERE p.purchaseDetailsDescription = :purchaseDetailsDescription"),
    @NamedQuery(name = "PurchaseDetails.findByPurchaseId", query = "SELECT p FROM PurchaseDetails p WHERE p.purchaseId = :purchaseId"),
    @NamedQuery(name = "PurchaseDetails.findByQuantity", query = "SELECT p FROM PurchaseDetails p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "PurchaseDetails.findByUom", query = "SELECT p FROM PurchaseDetails p WHERE p.uom = :uom"),
    @NamedQuery(name = "PurchaseDetails.findByItemCode", query = "SELECT p FROM PurchaseDetails p WHERE p.itemCode = :itemCode"),
    @NamedQuery(name = "PurchaseDetails.findByBatchCode", query = "SELECT p FROM PurchaseDetails p WHERE p.batchCode = :batchCode"),
    @NamedQuery(name = "PurchaseDetails.findByOrdered", query = "SELECT p FROM PurchaseDetails p WHERE p.ordered = :ordered"),
    @NamedQuery(name = "PurchaseDetails.findByRejected", query = "SELECT p FROM PurchaseDetails p WHERE p.rejected = :rejected"),
    @NamedQuery(name = "PurchaseDetails.findByRejectedReason", query = "SELECT p FROM PurchaseDetails p WHERE p.rejectedReason = :rejectedReason"),
    @NamedQuery(name = "PurchaseDetails.findByPurchasePrice", query = "SELECT p FROM PurchaseDetails p WHERE p.purchasePrice = :purchasePrice"),
    @NamedQuery(name = "PurchaseDetails.findByVat", query = "SELECT p FROM PurchaseDetails p WHERE p.vat = :vat"),
    @NamedQuery(name = "PurchaseDetails.findByTax", query = "SELECT p FROM PurchaseDetails p WHERE p.tax = :tax"),
    @NamedQuery(name = "PurchaseDetails.findByDiscount", query = "SELECT p FROM PurchaseDetails p WHERE p.discount = :discount"),
    @NamedQuery(name = "PurchaseDetails.findByNetPrice", query = "SELECT p FROM PurchaseDetails p WHERE p.netPrice = :netPrice"),
    @NamedQuery(name = "PurchaseDetails.findBySellingPrice", query = "SELECT p FROM PurchaseDetails p WHERE p.sellingPrice = :sellingPrice"),
    @NamedQuery(name = "PurchaseDetails.findByUserCreated", query = "SELECT p FROM PurchaseDetails p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "PurchaseDetails.findByUserModified", query = "SELECT p FROM PurchaseDetails p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "PurchaseDetails.findByDateCreated", query = "SELECT p FROM PurchaseDetails p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "PurchaseDetails.findByDateModified", query = "SELECT p FROM PurchaseDetails p WHERE p.dateModified = :dateModified"),
    @NamedQuery(name = "PurchaseDetails.findByProductCategoryId", query = "SELECT p FROM PurchaseDetails p WHERE p.productCategoryId = :productCategoryId"),
    @NamedQuery(name = "PurchaseDetails.findByProductId", query = "SELECT p FROM PurchaseDetails p WHERE p.productId = :productId"),
    @NamedQuery(name = "PurchaseDetails.findByDetailByPurchaseIdandProductId", query = "SELECT p FROM PurchaseDetails p WHERE p.purchaseId = :purchaseId and p.productId = :productId"),})

public class PurchaseDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_DETAILS_ID_GENERATOR", sequenceName="PURCHASE_DETAILS_SEQ",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASE_DETAILS_ID_GENERATOR")
    @Column(name = "purchase_details_id")
    private String purchaseDetailsId;
    @Column(name = "purchase_details_description")
    private String purchaseDetailsDescription;
    @Column(name = "purchase_id")
    private String purchaseId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "quantity_received")
    private Double quantityReceived;
    @Column(name = "quantity_available")
    private Double quantityAvailable;
    @Column(name = "uom")
    private String uom;
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "batch_code")
    private String batchCode;
    @Column(name = "ordered")
    private Double ordered;
    @Column(name = "rejected")
    private Double rejected;
    @Column(name = "rejected_reason")
    private String rejectedReason;
    @Column(name = "purchase_price")
    private Double purchasePrice;
    @Column(name = "vat")
    private Double vat;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "net_price")
    private Double netPrice;
    @Column(name = "selling_price")
    private Double sellingPrice;
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
    @Column(name = "product_category_id")
    private String productCategoryId;
    @Column(name = "product_id")
    private String productId;
    @Transient
    private String productCategoryDescription;

    public PurchaseDetails() {
    }

    public PurchaseDetails(String purchaseDetailsId) {
        this.purchaseDetailsId = purchaseDetailsId;
    }

    public String getPurchaseDetailsId() {
        return purchaseDetailsId;
    }

    public void setPurchaseDetailsId(String purchaseDetailsId) {
        this.purchaseDetailsId = purchaseDetailsId;
    }

    public String getPurchaseDetailsDescription() {
        return purchaseDetailsDescription;
    }

    public void setPurchaseDetailsDescription(String purchaseDetailsDescription) {
        this.purchaseDetailsDescription = purchaseDetailsDescription;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public Double getOrdered() {
        return ordered;
    }

    public void setOrdered(Double ordered) {
        this.ordered = ordered;
    }

    public Double getRejected() {
        return rejected;
    }

    public void setRejected(Double rejected) {
        this.rejected = rejected;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getQuantityReceived() {
        return quantityReceived;
    }

    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public String getProductCategoryDescription() {
        return productCategoryDescription;
    }

    public void setProductCategoryDescription(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }
    
     

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseDetailsId != null ? purchaseDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseDetails)) {
            return false;
        }
        PurchaseDetails other = (PurchaseDetails) object;
        if ((this.purchaseDetailsId == null && other.purchaseDetailsId != null) || (this.purchaseDetailsId != null && !this.purchaseDetailsId.equals(other.purchaseDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.PurchaseDetails[ purchaseDetailsId=" + purchaseDetailsId + " ]";
    }
    
}
