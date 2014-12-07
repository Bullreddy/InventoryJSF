package com.reddys.rad.inventory.db;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


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


/**
 *
 * @author REDDYS
 */
@Entity
@Table(name="product_category")
@NamedQueries({
//    @NamedQuery(name = "ProductCategory.findAll", query = "SELECT p FROM ProductCategory p"),
    @NamedQuery(name = "ProductCategory.findByProductCategoryId", query = "SELECT p FROM ProductCategory p WHERE p.productCategoryId = :productCategoryId"),
    @NamedQuery(name = "ProductCategory.findByProductCategoryDescription", query = "SELECT p FROM ProductCategory p WHERE p.productCategoryDescription = :productCategoryDescription"),
    @NamedQuery(name = "ProductCategory.findByStatus", query = "SELECT p FROM ProductCategory p WHERE p.status = :status"),
    @NamedQuery(name = "ProductCategory.findByRemarks", query = "SELECT p FROM ProductCategory p WHERE p.remarks = :remarks"),
    @NamedQuery(name = "ProductCategory.findByUserCreated", query = "SELECT p FROM ProductCategory p WHERE p.userCreated = :userCreated"),
    @NamedQuery(name = "ProductCategory.findByUserModified", query = "SELECT p FROM ProductCategory p WHERE p.userModified = :userModified"),
    @NamedQuery(name = "ProductCategory.findByDateCreated", query = "SELECT p FROM ProductCategory p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "ProductCategory.findByDateModified", query = "SELECT p FROM ProductCategory p WHERE p.dateModified = :dateModified")})
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 1L;
 
    @Id
 //   @Basic(optional = false)
    @SequenceGenerator(name="PURCHASE_CATEGORY_GENERATOR", sequenceName="product_category_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="PURCHASE_CATEGORY_GENERATOR")
    @Column(name = "product_category_id")
    private Integer productCategoryId;
    @Column(name = "product_category_description")
    private String productCategoryDescription;
    @Column(name = "status")
    private String status;
    @Column(name = "remarks")
    private String remarks;
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
    

    public ProductCategory() {
    }

    public ProductCategory(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryDescription() {
        return productCategoryDescription;
    }

    public void setProductCategoryDescription(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategory)) {
            return false;
        }
        ProductCategory other = (ProductCategory) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " productCategoryId=" + productCategoryId ;
    }
    
}
