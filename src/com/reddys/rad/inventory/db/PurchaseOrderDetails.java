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
 * @author REDDYS
 */
@Entity
@Table(name = "purchase_order_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseOrderDetails.findAll", query = "SELECT p FROM PurchaseOrderDetails p"),
    @NamedQuery(name = "PurchaseOrderDetails.findByOrderDetailId", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.orderDetailId = :orderDetailId"),
    @NamedQuery(name = "PurchaseOrderDetails.findByOrderDetailDescription", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.orderDetailDescription = :orderDetailDescription"),
    @NamedQuery(name = "PurchaseOrderDetails.findByPurchaseOrderId", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.purchaseOrderId = :purchaseOrderId"),
    @NamedQuery(name = "PurchaseOrderDetails.findByPurchaseOrderDate", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.purchaseOrderDate = :purchaseOrderDate"),
    @NamedQuery(name = "PurchaseOrderDetails.findByProductName", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.productName = :productName"),
    @NamedQuery(name = "PurchaseOrderDetails.findByQuantity", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "PurchaseOrderDetails.findByUom", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.uom = :uom"),
    @NamedQuery(name = "PurchaseOrderDetails.findByUnitPrice", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.unitPrice = :unitPrice"),
    @NamedQuery(name = "PurchaseOrderDetails.findByDiscount", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.discount = :discount"),
    @NamedQuery(name = "PurchaseOrderDetails.findBySubTotal", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.subTotal = :subTotal"),
    @NamedQuery(name = "PurchaseOrderDetails.findByTax", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.tax = :tax"),
    @NamedQuery(name = "PurchaseOrderDetails.findByVat", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.vat = :vat"),
    @NamedQuery(name = "PurchaseOrderDetails.findByUserCreated", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "PurchaseOrderDetails.findByUserModified", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "PurchaseOrderDetails.findByDateCreated", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "PurchaseOrderDetails.findByDateModified", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.dateModified = :dateModified"),
    @NamedQuery(name = "PurchaseOrderDetails.findByPurchaseOrderIdandProductId", query = "SELECT p FROM PurchaseOrderDetails p WHERE p.purchaseOrderId = :purchaseOrderId and p.productId =:productId"),})
public class PurchaseOrderDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_ORDER_DETAIL_PURCHASEORDERID_GENERATOR", sequenceName="purchase_order_details_sequence",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASE_ORDER_DETAIL_PURCHASEORDERID_GENERATOR")
    @Column(name = "order_detail_id")
    private String orderDetailId;
    @Column(name = "order_detail_description")
    private String orderDetailDescription;
    @Column(name = "purchase_order_id")
    private String purchaseOrderId;
    @Column(name = "purchase_order_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseOrderDate;
    @Column(name = "product_name")
    private String productName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "uom")
    private String uom;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "sub_total")
    private Double subTotal;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "vat")
    private Double vat;
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
    @Column(name="product_id")
    private String productId;
    @Column(name="quantity_received")
    private Double quantityReceived;
    @Column(name="quantity_ordered")
    private Double quantityOrdered;    
    @Column(name="quantity_rejected")
    private Double quantityRejected; 
    @Column(name="quantity_remaining")
    private Double quantityRemaining; 
    @Transient
    private String productCategory;
    @Transient
    private String itemCode;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    public PurchaseOrderDetails() {
    }

    public PurchaseOrderDetails(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderDetailDescription() {
        return orderDetailDescription;
    }

    public void setOrderDetailDescription(String orderDetailDescription) {
        this.orderDetailDescription = orderDetailDescription;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate(Date purchaseOrderDate) {
        this.purchaseOrderDate = purchaseOrderDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
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


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

        public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getQuantityReceived() {
        return quantityReceived;
    }

    public Double getQuantityRejected() {
        return quantityRejected;
    }

    public Double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public void setQuantityRejected(Double quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

    public Double getQuantityRemaining() {
        return quantityRemaining;
    }

    public void setQuantityRemaining(Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDetailId != null ? orderDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrderDetails)) {
            return false;
        }
        PurchaseOrderDetails other = (PurchaseOrderDetails) object;
        if ((this.orderDetailId == null && other.orderDetailId != null) || (this.orderDetailId != null && !this.orderDetailId.equals(other.orderDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.PurchaseOrderDetails[ orderDetailId=" + orderDetailId + "product_name=" + productName +"quantity=" + quantity +"uom=" + uom +""
                + "discount=" + discount +"subTotal=" + subTotal +" ]";
    }
    
}
