package com.reddys.rad.inventory.db;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author REDDYS
 */
@Entity
@Table(name = "vendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v"),
    @NamedQuery(name = "Vendor.findByVendorid", query = "SELECT v FROM Vendor v WHERE v.vendorid = :vendorid"),
    @NamedQuery(name = "Vendor.findByVendorname", query = "SELECT v FROM Vendor v WHERE v.vendorname = :vendorname"),
    @NamedQuery(name = "Vendor.findByVendortype", query = "SELECT v FROM Vendor v WHERE v.vendortype = :vendortype"),
    @NamedQuery(name = "Vendor.findByContactperson", query = "SELECT v FROM Vendor v WHERE v.contactperson = :contactperson"),
    @NamedQuery(name = "Vendor.findByContactpersonnumber", query = "SELECT v FROM Vendor v WHERE v.contactpersonnumber = :contactpersonnumber"),
    @NamedQuery(name = "Vendor.findByContactpersonaddress1", query = "SELECT v FROM Vendor v WHERE v.contactpersonaddress1 = :contactpersonaddress1"),
    @NamedQuery(name = "Vendor.findByContactpersonaddress2", query = "SELECT v FROM Vendor v WHERE v.contactpersonaddress2 = :contactpersonaddress2"),
    @NamedQuery(name = "Vendor.findByContactpersoncountry", query = "SELECT v FROM Vendor v WHERE v.contactpersoncountry = :contactpersoncountry"),
    @NamedQuery(name = "Vendor.findByContactpersonstate", query = "SELECT v FROM Vendor v WHERE v.contactpersonstate = :contactpersonstate"),
    @NamedQuery(name = "Vendor.findByContactpersoncity", query = "SELECT v FROM Vendor v WHERE v.contactpersoncity = :contactpersoncity"),
    @NamedQuery(name = "Vendor.findByContactpersonpincode", query = "SELECT v FROM Vendor v WHERE v.contactpersonpincode = :contactpersonpincode"),
    @NamedQuery(name = "Vendor.findByContactpersontelephone", query = "SELECT v FROM Vendor v WHERE v.contactpersontelephone = :contactpersontelephone"),
    @NamedQuery(name = "Vendor.findByContactpersonemailid", query = "SELECT v FROM Vendor v WHERE v.contactpersonemailid = :contactpersonemailid"),
    @NamedQuery(name = "Vendor.findByAddress1", query = "SELECT v FROM Vendor v WHERE v.address1 = :address1"),
    @NamedQuery(name = "Vendor.findByAddress2", query = "SELECT v FROM Vendor v WHERE v.address2 = :address2"),
    @NamedQuery(name = "Vendor.findByCountry", query = "SELECT v FROM Vendor v WHERE v.country = :country"),
    @NamedQuery(name = "Vendor.findByState", query = "SELECT v FROM Vendor v WHERE v.state = :state"),
    @NamedQuery(name = "Vendor.findByCity", query = "SELECT v FROM Vendor v WHERE v.city = :city"),
    @NamedQuery(name = "Vendor.findByPincode", query = "SELECT v FROM Vendor v WHERE v.pincode = :pincode"),
    @NamedQuery(name = "Vendor.findByEmailid", query = "SELECT v FROM Vendor v WHERE v.emailid = :emailid"),
    @NamedQuery(name = "Vendor.findByMobilenumber", query = "SELECT v FROM Vendor v WHERE v.mobilenumber = :mobilenumber"),
    @NamedQuery(name = "Vendor.findByLandlinenumber", query = "SELECT v FROM Vendor v WHERE v.landlinenumber = :landlinenumber"),
    @NamedQuery(name = "Vendor.findByWebsite", query = "SELECT v FROM Vendor v WHERE v.website = :website"),
    @NamedQuery(name = "Vendor.findByStatus", query = "SELECT v FROM Vendor v WHERE v.status = :status"),
    @NamedQuery(name = "Vendor.findByRemarks", query = "SELECT v FROM Vendor v WHERE v.remarks = :remarks"),
    @NamedQuery(name = "Vendor.findByModeoftransport", query = "SELECT v FROM Vendor v WHERE v.modeoftransport = :modeoftransport"),
    @NamedQuery(name = "Vendor.findByModeofpayment", query = "SELECT v FROM Vendor v WHERE v.modeofpayment = :modeofpayment"),
    @NamedQuery(name = "Vendor.findByCurrency", query = "SELECT v FROM Vendor v WHERE v.currency = :currency"),
    @NamedQuery(name = "Vendor.findByAccountnumber", query = "SELECT v FROM Vendor v WHERE v.accountnumber = :accountnumber"),
    @NamedQuery(name = "Vendor.findByAccountholdername", query = "SELECT v FROM Vendor v WHERE v.accountholdername = :accountholdername"),
    @NamedQuery(name = "Vendor.findByBank", query = "SELECT v FROM Vendor v WHERE v.bank = :bank"),
    @NamedQuery(name = "Vendor.findByBranch", query = "SELECT v FROM Vendor v WHERE v.branch = :branch"),
    @NamedQuery(name = "Vendor.findByIfsccode", query = "SELECT v FROM Vendor v WHERE v.ifsccode = :ifsccode"),
    @NamedQuery(name = "Vendor.findByAcoounttype", query = "SELECT v FROM Vendor v WHERE v.acoounttype = :acoounttype"),
    @NamedQuery(name = "Vendor.findByPannumber", query = "SELECT v FROM Vendor v WHERE v.pannumber = :pannumber"),
    @NamedQuery(name = "Vendor.findByTinnumber", query = "SELECT v FROM Vendor v WHERE v.tinnumber = :tinnumber"),
    @NamedQuery(name = "Vendor.findByIsregistered", query = "SELECT v FROM Vendor v WHERE v.isregistered = :isregistered"),
    @NamedQuery(name = "Vendor.findByRegisternumber", query = "SELECT v FROM Vendor v WHERE v.registernumber = :registernumber")})
public class Vendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="VENDOR_GENERATOR", sequenceName="vendor_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="VENDOR_GENERATOR")    
    @Column(name = "vendorid")
    private String vendorid;
    @Column(name = "vendorname")
    private String vendorname;
    @Column(name = "vendortype")
    private String vendortype;
    @Column(name = "contactperson")
    private String contactperson;
    @Column(name = "contactpersonnumber")
    private String contactpersonnumber;
    @Column(name = "contactpersonaddress1")
    private String contactpersonaddress1;
    @Column(name = "contactpersonaddress2")
    private String contactpersonaddress2;
    @Column(name = "contactpersoncountry")
    private String contactpersoncountry;
    @Column(name = "contactpersonstate")
    private String contactpersonstate;
    @Column(name = "contactpersoncity")
    private String contactpersoncity;
    @Column(name = "contactpersonpincode")
    private String contactpersonpincode;
    @Column(name = "contactpersontelephone")
    private String contactpersontelephone;
    @Column(name = "contactpersonemailid")
    private String contactpersonemailid;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "country")
    private String country;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "mobilenumber")
    private String mobilenumber;
    @Column(name = "landlinenumber")
    private String landlinenumber;
    @Column(name = "website")
    private String website;
    @Column(name = "status")
    private String status;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "modeoftransport")
    private String modeoftransport;
    @Column(name = "modeofpayment")
    private String modeofpayment;
    @Column(name = "currency")
    private String currency;
    @Column(name = "accountnumber")
    private String accountnumber;
    @Column(name = "accountholdername")
    private String accountholdername;
    @Column(name = "bank")
    private String bank;
    @Column(name = "branch")
    private String branch;
    @Column(name = "ifsccode")
    private String ifsccode;
    @Column(name = "acoounttype")
    private String acoounttype;
    @Column(name = "pannumber")
    private String pannumber;
    @Column(name = "tinnumber")
    private String tinnumber;
    @Column(name = "isregistered")
    private String isregistered;
    @Column(name = "registernumber")
    private String registernumber;


    public Vendor() {
    }

    public Vendor(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getVendortype() {
        return vendortype;
    }

    public void setVendortype(String vendortype) {
        this.vendortype = vendortype;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getContactpersonnumber() {
        return contactpersonnumber;
    }

    public void setContactpersonnumber(String contactpersonnumber) {
        this.contactpersonnumber = contactpersonnumber;
    }

    public String getContactpersonaddress1() {
        return contactpersonaddress1;
    }

    public void setContactpersonaddress1(String contactpersonaddress1) {
        this.contactpersonaddress1 = contactpersonaddress1;
    }

    public String getContactpersonaddress2() {
        return contactpersonaddress2;
    }

    public void setContactpersonaddress2(String contactpersonaddress2) {
        this.contactpersonaddress2 = contactpersonaddress2;
    }

    public String getContactpersoncountry() {
        return contactpersoncountry;
    }

    public void setContactpersoncountry(String contactpersoncountry) {
        this.contactpersoncountry = contactpersoncountry;
    }

    public String getContactpersonstate() {
        return contactpersonstate;
    }

    public void setContactpersonstate(String contactpersonstate) {
        this.contactpersonstate = contactpersonstate;
    }

    public String getContactpersoncity() {
        return contactpersoncity;
    }

    public void setContactpersoncity(String contactpersoncity) {
        this.contactpersoncity = contactpersoncity;
    }

    public String getContactpersonpincode() {
        return contactpersonpincode;
    }

    public void setContactpersonpincode(String contactpersonpincode) {
        this.contactpersonpincode = contactpersonpincode;
    }

    public String getContactpersontelephone() {
        return contactpersontelephone;
    }

    public void setContactpersontelephone(String contactpersontelephone) {
        this.contactpersontelephone = contactpersontelephone;
    }

    public String getContactpersonemailid() {
        return contactpersonemailid;
    }

    public void setContactpersonemailid(String contactpersonemailid) {
        this.contactpersonemailid = contactpersonemailid;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getLandlinenumber() {
        return landlinenumber;
    }

    public void setLandlinenumber(String landlinenumber) {
        this.landlinenumber = landlinenumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public String getModeoftransport() {
        return modeoftransport;
    }

    public void setModeoftransport(String modeoftransport) {
        this.modeoftransport = modeoftransport;
    }

    public String getModeofpayment() {
        return modeofpayment;
    }

    public void setModeofpayment(String modeofpayment) {
        this.modeofpayment = modeofpayment;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIfsccode() {
        return ifsccode;
    }

    public void setIfsccode(String ifsccode) {
        this.ifsccode = ifsccode;
    }

    public String getAcoounttype() {
        return acoounttype;
    }

    public void setAcoounttype(String acoounttype) {
        this.acoounttype = acoounttype;
    }

    public String getPannumber() {
        return pannumber;
    }

    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }

    public String getTinnumber() {
        return tinnumber;
    }

    public void setTinnumber(String tinnumber) {
        this.tinnumber = tinnumber;
    }

    public String getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(String isregistered) {
        this.isregistered = isregistered;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorid != null ? vendorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.vendorid == null && other.vendorid != null) || (this.vendorid != null && !this.vendorid.equals(other.vendorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  vendorname;
    }
    
}
