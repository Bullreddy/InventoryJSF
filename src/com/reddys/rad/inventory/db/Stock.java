/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.db;

import java.io.Serializable;
import java.lang.Double;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author B V Dinesh
 */
@Entity
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findByStockId", query = "SELECT s FROM Stock s WHERE s.stockId = :stockId"),
    @NamedQuery(name = "Stock.findByStockDescription", query = "SELECT s FROM Stock s WHERE s.stockDescription = :stockDescription"),
    @NamedQuery(name = "Stock.findByProductId", query = "SELECT s FROM Stock s WHERE s.productId = :productId"),
    @NamedQuery(name = "Stock.findBySoldQuantity", query = "SELECT s FROM Stock s WHERE s.soldQuantity = :soldQuantity"),
    @NamedQuery(name = "Stock.findByAvailableQuantity", query = "SELECT s FROM Stock s WHERE s.availableQuantity = :availableQuantity"),
    @NamedQuery(name = "Stock.findByPurchasedQuantity", query = "SELECT s FROM Stock s WHERE s.purchasedQuantity = :purchasedQuantity"),
    @NamedQuery(name = "Stock.findByUom", query = "SELECT s FROM Stock s WHERE s.uom = :uom"),
    @NamedQuery(name = "Stock.findByMinimumStock", query = "SELECT s FROM Stock s WHERE s.minimumStock = :minimumStock"),
    @NamedQuery(name = "Stock.findByMaximumStock", query = "SELECT s FROM Stock s WHERE s.maximumStock = :maximumStock"),
    @NamedQuery(name = "Stock.findByDeficitStock", query = "SELECT s FROM Stock s WHERE s.deficitStock = :deficitStock"),
    @NamedQuery(name = "Stock.findByDeficitReason", query = "SELECT s FROM Stock s WHERE s.deficitReason = :deficitReason"),
    @NamedQuery(name = "Stock.findByExcessStock", query = "SELECT s FROM Stock s WHERE s.excessStock = :excessStock"),
    @NamedQuery(name = "Stock.findByExcessReason", query = "SELECT s FROM Stock s WHERE s.excessReason = :excessReason"),
    @NamedQuery(name = "Stock.findByLastAuditedOn", query = "SELECT s FROM Stock s WHERE s.lastAuditedOn = :lastAuditedOn"),
    @NamedQuery(name = "Stock.findByLastAuditedBy", query = "SELECT s FROM Stock s WHERE s.lastAuditedBy = :lastAuditedBy"),
    @NamedQuery(name = "Stock.findByRecentPurchasedOn", query = "SELECT s FROM Stock s WHERE s.recentPurchasedOn = :recentPurchasedOn"),
    @NamedQuery(name = "Stock.findByRecentPurchasedFrom", query = "SELECT s FROM Stock s WHERE s.recentPurchasedFrom = :recentPurchasedFrom"),
    @NamedQuery(name = "Stock.findByQuantityAdjusted", query = "SELECT s FROM Stock s WHERE s.quantityAdjusted = :quantityAdjusted"),
    @NamedQuery(name = "Stock.findByAdjustedBy", query = "SELECT s FROM Stock s WHERE s.adjustedBy = :adjustedBy"),
    @NamedQuery(name = "Stock.findByAdjustedReason", query = "SELECT s FROM Stock s WHERE s.adjustedReason = :adjustedReason"),
    @NamedQuery(name = "Stock.findByBusinessType", query = "SELECT s FROM Stock s WHERE s.businessType = :businessType"),
    @NamedQuery(name = "Stock.findByUserCreated", query = "SELECT s FROM Stock s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "Stock.findByUserModified", query = "SELECT s FROM Stock s WHERE s.userModified = :userModified"),
    @NamedQuery(name = "Stock.findByDateCreated", query = "SELECT s FROM Stock s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "Stock.findByDateModified", query = "SELECT s FROM Stock s WHERE s.dateModified = :dateModified")})
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="STOCK_STOCKID_GENERATOR", sequenceName="stock_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STOCK_STOCKID_GENERATOR")
    @Column(name = "stock_id")
    private String stockId;
    @Column(name = "stock_description")
    private String stockDescription;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "sold_quantity")
    private Double soldQuantity;
    @Column(name = "available_quantity")
    private Double availableQuantity;
    @Column(name = "purchased_quantity")
    private Double purchasedQuantity;
    @Column(name = "uom")
    private String uom;
    @Column(name = "minimum_stock")
    private Double minimumStock;
    @Column(name = "maximum_stock")
    private Double maximumStock;
    @Column(name = "deficit_stock")
    private Double deficitStock;
    @Column(name = "deficit_reason")
    private String deficitReason;
    @Column(name = "excess_stock")
    private Double excessStock;
    @Column(name = "excess_reason")
    private String excessReason;
    @Column(name = "last_audited_on")
    @Temporal(TemporalType.DATE)
    private Date lastAuditedOn;
    @Column(name = "last_audited_by")
    private String lastAuditedBy;
    @Column(name = "recent_purchased_on")
    @Temporal(TemporalType.DATE)
    private Date recentPurchasedOn;
    @Column(name = "recent_purchased_from")
    private String recentPurchasedFrom;
    @Column(name = "quantity_adjusted")
    private Double quantityAdjusted;
    @Column(name = "adjusted_by")
    private String adjustedBy;
    @Column(name = "adjusted_reason")
    private String adjustedReason;
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
    @OneToMany(mappedBy = "stockId")
    private Collection<StockDetails> stockDetailsCollection;
    @Transient
    private String productDescription;
    @Transient
    private String productCategory;

    public Stock() {
    }

    public Stock(String stockId) {
        this.stockId = stockId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockDescription() {
        return stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Double soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Double getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(Double purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Double getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(Double minimumStock) {
        this.minimumStock = minimumStock;
    }

    public Double getMaximumStock() {
        return maximumStock;
    }

    public void setMaximumStock(Double maximumStock) {
        this.maximumStock = maximumStock;
    }

    public Double getDeficitStock() {
        return deficitStock;
    }

    public void setDeficitStock(Double deficitStock) {
        this.deficitStock = deficitStock;
    }

    public String getDeficitReason() {
        return deficitReason;
    }

    public void setDeficitReason(String deficitReason) {
        this.deficitReason = deficitReason;
    }

    public Double getExcessStock() {
        return excessStock;
    }

    public void setExcessStock(Double excessStock) {
        this.excessStock = excessStock;
    }

    public String getExcessReason() {
        return excessReason;
    }

    public void setExcessReason(String excessReason) {
        this.excessReason = excessReason;
    }

    public Date getLastAuditedOn() {
        return lastAuditedOn;
    }

    public void setLastAuditedOn(Date lastAuditedOn) {
        this.lastAuditedOn = lastAuditedOn;
    }

    public String getLastAuditedBy() {
        return lastAuditedBy;
    }

    public void setLastAuditedBy(String lastAuditedBy) {
        this.lastAuditedBy = lastAuditedBy;
    }

    public Date getRecentPurchasedOn() {
        return recentPurchasedOn;
    }

    public void setRecentPurchasedOn(Date recentPurchasedOn) {
        this.recentPurchasedOn = recentPurchasedOn;
    }

    public String getRecentPurchasedFrom() {
        return recentPurchasedFrom;
    }

    public void setRecentPurchasedFrom(String recentPurchasedFrom) {
        this.recentPurchasedFrom = recentPurchasedFrom;
    }

    public Double getQuantityAdjusted() {
        return quantityAdjusted;
    }

    public void setQuantityAdjusted(Double quantityAdjusted) {
        this.quantityAdjusted = quantityAdjusted;
    }

    public String getAdjustedBy() {
        return adjustedBy;
    }

    public void setAdjustedBy(String adjustedBy) {
        this.adjustedBy = adjustedBy;
    }

    public String getAdjustedReason() {
        return adjustedReason;
    }

    public void setAdjustedReason(String adjustedReason) {
        this.adjustedReason = adjustedReason;
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

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    @XmlTransient
    public Collection<StockDetails> getStockDetailsCollection() {
        return stockDetailsCollection;
    }

    public void setStockDetailsCollection(Collection<StockDetails> stockDetailsCollection) {
        this.stockDetailsCollection = stockDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockId != null ? stockId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.stockId == null && other.stockId != null) || (this.stockId != null && !this.stockId.equals(other.stockId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reddys.rad.inventory.db.Stock[ stockId=" + stockId + " ]";
    }
    
}
