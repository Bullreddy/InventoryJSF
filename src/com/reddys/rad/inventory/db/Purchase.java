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
@Table(name = "purchase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purchase.findAll", query = "SELECT p FROM Purchase p"),
    @NamedQuery(name = "Purchase.findByPurchaseId", query = "SELECT p FROM Purchase p WHERE p.purchaseId = :purchaseId"),
    @NamedQuery(name = "Purchase.findByProductDescription", query = "SELECT p FROM Purchase p WHERE p.productDescription = :productDescription"),
    @NamedQuery(name = "Purchase.findByPurchaseOrderDate", query = "SELECT p FROM Purchase p WHERE p.purchaseOrderDate = :purchaseOrderDate"),
    @NamedQuery(name = "Purchase.findByPurchaseDate", query = "SELECT p FROM Purchase p WHERE p.purchaseDate = :purchaseDate"),
    @NamedQuery(name = "Purchase.findByTotalAmount", query = "SELECT p FROM Purchase p WHERE p.totalAmount = :totalAmount"),
    @NamedQuery(name = "Purchase.findByTax", query = "SELECT p FROM Purchase p WHERE p.tax = :tax"),
    @NamedQuery(name = "Purchase.findByVat", query = "SELECT p FROM Purchase p WHERE p.vat = :vat"),
    @NamedQuery(name = "Purchase.findByDiscount", query = "SELECT p FROM Purchase p WHERE p.discount = :discount"),
    @NamedQuery(name = "Purchase.findByNetAmount", query = "SELECT p FROM Purchase p WHERE p.netAmount = :netAmount"),
    @NamedQuery(name = "Purchase.findByUserCreated", query = "SELECT p FROM Purchase p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "Purchase.findByUserModified", query = "SELECT p FROM Purchase p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "Purchase.findByDateCreated", query = "SELECT p FROM Purchase p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "Purchase.findByDateModified", query = "SELECT p FROM Purchase p WHERE p.dateModified = :dateModified")})
public class Purchase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="purchase_id_generator",sequenceName = "purchase_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_id_generator")
    @Column(name = "purchase_id")
    private String purchaseId;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "purchase_order_no")
    private String purchaseOrderNo;
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "purchase_order_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseOrderDate;
    @Column(name = "purchase_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "vat")
    private Double vat;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "net_amount")
    private Double netAmount;
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

    public Purchase() {
    }

    public Purchase(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate(Date purchaseOrderDate) {
        this.purchaseOrderDate = purchaseOrderDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
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

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public String getVendorId() {
        return vendorId;
    }

    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseId != null ? purchaseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchase)) {
            return false;
        }
        Purchase other = (Purchase) object;
        if ((this.purchaseId == null && other.purchaseId != null) || (this.purchaseId != null && !this.purchaseId.equals(other.purchaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return purchaseId;
    }
    
}
