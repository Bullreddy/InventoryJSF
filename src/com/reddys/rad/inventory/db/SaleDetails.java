/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "sale_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaleDetails.findAll", query = "SELECT s FROM SaleDetails s"),
    @NamedQuery(name = "SaleDetails.findBySaleDetailId", query = "SELECT s FROM SaleDetails s WHERE s.saleDetailId = :saleDetailId"),
     @NamedQuery(name = "SaleDetails.findBySaleId", query = "SELECT s FROM SaleDetails s WHERE s.saleId = :saleId"),
    @NamedQuery(name = "SaleDetails.findByProductDescription", query = "SELECT s FROM SaleDetails s WHERE s.productDescription = :productDescription"),
    @NamedQuery(name = "SaleDetails.findByProductCategory", query = "SELECT s FROM SaleDetails s WHERE s.productCategory = :productCategory"),
    @NamedQuery(name = "SaleDetails.findByItemCode", query = "SELECT s FROM SaleDetails s WHERE s.itemCode = :itemCode"),
    @NamedQuery(name = "SaleDetails.findByBatchCode", query = "SELECT s FROM SaleDetails s WHERE s.batchCode = :batchCode"),
    @NamedQuery(name = "SaleDetails.findByQuantity", query = "SELECT s FROM SaleDetails s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "SaleDetails.findByUom", query = "SELECT s FROM SaleDetails s WHERE s.uom = :uom"),
    @NamedQuery(name = "SaleDetails.findByUnitPrice", query = "SELECT s FROM SaleDetails s WHERE s.unitPrice = :unitPrice"),
    @NamedQuery(name = "SaleDetails.findByProductImage", query = "SELECT s FROM SaleDetails s WHERE s.productImage = :productImage"),
    @NamedQuery(name = "SaleDetails.findByVat", query = "SELECT s FROM SaleDetails s WHERE s.vat = :vat"),
    @NamedQuery(name = "SaleDetails.findByTax", query = "SELECT s FROM SaleDetails s WHERE s.tax = :tax"),
    @NamedQuery(name = "SaleDetails.findByDiscount", query = "SELECT s FROM SaleDetails s WHERE s.discount = :discount"),
    @NamedQuery(name = "SaleDetails.findByBalance", query = "SELECT s FROM SaleDetails s WHERE s.balance = :balance"),
    @NamedQuery(name = "SaleDetails.findByProductLength", query = "SELECT s FROM SaleDetails s WHERE s.productLength = :productLength"),
    @NamedQuery(name = "SaleDetails.findByNetPrice", query = "SELECT s FROM SaleDetails s WHERE s.netPrice = :netPrice"),
    @NamedQuery(name = "SaleDetails.findByRemarks", query = "SELECT s FROM SaleDetails s WHERE s.remarks = :remarks"),
    @NamedQuery(name = "SaleDetails.findByBusinessType", query = "SELECT s FROM SaleDetails s WHERE s.businessType = :businessType"),
    @NamedQuery(name = "SaleDetails.findByUserCreated", query = "SELECT s FROM SaleDetails s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "SaleDetails.findByUserModified", query = "SELECT s FROM SaleDetails s WHERE s.userModified = :userModified"),
    @NamedQuery(name = "SaleDetails.findByDateCreated", query = "SELECT s FROM SaleDetails s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "SaleDetails.findByDateModified", query = "SELECT s FROM SaleDetails s WHERE s.dateModified = :dateModified"),
    @NamedQuery(name = "SaleDetails.findByQuantityReturned", query = "SELECT s FROM SaleDetails s WHERE s.quantityReturned = :quantityReturned")})
public class SaleDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="SALE_DETAIL_SALEDETAILID_GENERATOR", sequenceName="sale_details_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALE_DETAIL_SALEDETAILID_GENERATOR")
    @Column(name = "sale_detail_id")
    private String saleDetailId;
    @Column(name = "product_description")
    private String productDescription;
        @Column(name = "product_id")
    private String productId;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "batch_code")
    private String batchCode;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "quantity_returned")
    private Double quantityReturned;
    @Column(name = "uom")
    private String uom;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "vat")
    private Double vat;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "product_length")
    private Double productLength;
    @Column(name = "net_price")
    private Double netPrice;
    @Column(name = "remarks")
    private String remarks;
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
    @JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
    @ManyToOne
    private Sale saleId;

    public SaleDetails() {
    }

    public SaleDetails(String saleDetailId) {
        this.saleDetailId = saleDetailId;
    }

    public String getSaleDetailId() {
        return saleDetailId;
    }

    public void setSaleDetailId(String saleDetailId) {
        this.saleDetailId = saleDetailId;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
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

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getProductLength() {
        return productLength;
    }

    public void setProductLength(Double productLength) {
        this.productLength = productLength;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Double getQuantityReturned() {
        return quantityReturned;
    }

    public void setQuantityReturned(Double quantityReturned) {
        this.quantityReturned = quantityReturned;
    }
        public Sale getSaleId() {
        return saleId;
    }

    public void setSaleId(Sale saleId) {
        this.saleId = saleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleDetailId != null ? saleDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaleDetails)) {
            return false;
        }
        SaleDetails other = (SaleDetails) object;
        if ((this.saleDetailId == null && other.saleDetailId != null) || (this.saleDetailId != null && !this.saleDetailId.equals(other.saleDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.SaleDetails[ saleDetailId=" + saleDetailId + " ]";
    }
    
}
