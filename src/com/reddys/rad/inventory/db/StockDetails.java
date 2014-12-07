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
@Table(name = "stock_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StockDetails.findAll", query = "SELECT s FROM StockDetails s"),
    @NamedQuery(name = "StockDetails.findByStockDetailId", query = "SELECT s FROM StockDetails s WHERE s.stockDetailId = :stockDetailId"),
    @NamedQuery(name = "StockDetails.findByStockDetailDescription", query = "SELECT s FROM StockDetails s WHERE s.stockDetailDescription = :stockDetailDescription"),
    @NamedQuery(name = "StockDetails.findByProductDescription", query = "SELECT s FROM StockDetails s WHERE s.productDescription = :productDescription"),
    @NamedQuery(name = "StockDetails.findByProductCategory", query = "SELECT s FROM StockDetails s WHERE s.productCategory = :productCategory"),
    @NamedQuery(name = "StockDetails.findByQuantity", query = "SELECT s FROM StockDetails s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "StockDetails.findByUom", query = "SELECT s FROM StockDetails s WHERE s.uom = :uom"),
    @NamedQuery(name = "StockDetails.findByTransactionId", query = "SELECT s FROM StockDetails s WHERE s.transactionId = :transactionId"),
    @NamedQuery(name = "StockDetails.findByTransactionAmount", query = "SELECT s FROM StockDetails s WHERE s.transactionAmount = :transactionAmount"),
    @NamedQuery(name = "StockDetails.findByTransactionType", query = "SELECT s FROM StockDetails s WHERE s.transactionType = :transactionType"),
    @NamedQuery(name = "StockDetails.findByTransactionDate", query = "SELECT s FROM StockDetails s WHERE s.transactionDate = :transactionDate"),
    @NamedQuery(name = "StockDetails.findByTransactionDetails", query = "SELECT s FROM StockDetails s WHERE s.transactionDetails = :transactionDetails"),
    @NamedQuery(name = "StockDetails.findByAvailableQuantity", query = "SELECT s FROM StockDetails s WHERE s.availableQuantity = :availableQuantity"),
    @NamedQuery(name = "StockDetails.findByQuantityInstock", query = "SELECT s FROM StockDetails s WHERE s.quantityInstock = :quantityInstock"),
    @NamedQuery(name = "StockDetails.findByRemarks", query = "SELECT s FROM StockDetails s WHERE s.remarks = :remarks"),
    @NamedQuery(name = "StockDetails.findByContactDetails", query = "SELECT s FROM StockDetails s WHERE s.contactDetails = :contactDetails"),
    @NamedQuery(name = "StockDetails.findByBusinessType", query = "SELECT s FROM StockDetails s WHERE s.businessType = :businessType"),
    @NamedQuery(name = "StockDetails.findByUserCreated", query = "SELECT s FROM StockDetails s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "StockDetails.findByUserModified", query = "SELECT s FROM StockDetails s WHERE s.userModified = :userModified"),
    @NamedQuery(name = "StockDetails.findByDateCreated", query = "SELECT s FROM StockDetails s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "StockDetails.findByDateModified", query = "SELECT s FROM StockDetails s WHERE s.dateModified = :dateModified")})
public class StockDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="STOCKDETAIL_STOCKDETAILID_GENERATOR", sequenceName="stock_details_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STOCKDETAIL_STOCKDETAILID_GENERATOR")
    @Column(name = "stock_detail_id")
    private String stockDetailId;
    @Column(name = "stock_detail_description")
    private String stockDetailDescription;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "uom")
    private String uom;
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "transaction_amount")
    private Double transactionAmount;
    @Column(name = "transaction_type")
    private String transactionType;
    @Column(name = "transaction_date")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Column(name = "transaction_details")
    private String transactionDetails;
    @Column(name = "available_quantity")
    private Double availableQuantity;
    @Column(name = "quantity_instock")
    private Double quantityInstock;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "contact_details")
    private String contactDetails;
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
    @JoinColumn(name = "stock_id", referencedColumnName = "stock_id")
    @ManyToOne
    private Stock stockId;

    public StockDetails() {
    }

    public StockDetails(String stockDetailId) {
        this.stockDetailId = stockDetailId;
    }

    public String getStockDetailId() {
        return stockDetailId;
    }

    public void setStockDetailId(String stockDetailId) {
        this.stockDetailId = stockDetailId;
    }

    public String getStockDetailDescription() {
        return stockDetailDescription;
    }

    public void setStockDetailDescription(String stockDetailDescription) {
        this.stockDetailDescription = stockDetailDescription;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public Double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Double getQuantityInstock() {
        return quantityInstock;
    }

    public void setQuantityInstock(Double quantityInstock) {
        this.quantityInstock = quantityInstock;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
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

    public Stock getStockId() {
        return stockId;
    }

    public void setStockId(Stock stockId) {
        this.stockId = stockId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockDetailId != null ? stockDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockDetails)) {
            return false;
        }
        StockDetails other = (StockDetails) object;
        if ((this.stockDetailId == null && other.stockDetailId != null) || (this.stockDetailId != null && !this.stockDetailId.equals(other.stockDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.StockDetails[ stockDetailId=" + stockDetailId + " ]";
    }
    
}
