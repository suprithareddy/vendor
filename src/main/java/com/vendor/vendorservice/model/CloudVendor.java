package com.vendor.vendorservice.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {

    @Id
    private String vendorId;
    
    private String vendorName;
    private String vendorAddress;
    private String vendorContact;
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public String getVendorContact() {
        return vendorContact;
    }
    public void setVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
    }
    public CloudVendor(String vendorName, String vendorId, String vendorAddress, String vendorContact) {
        this.vendorName = vendorName;
        this.vendorId = vendorId;
        this.vendorAddress = vendorAddress;
        this.vendorContact = vendorContact;
    }
    public CloudVendor() {
    }
    @Override
    public String toString() {
        return "CloudVendor [vendorName=" + vendorName + ", vendorId=" + vendorId + ", vendorAddress=" + vendorAddress
                + ", vendorContact=" + vendorContact + "]";
    }
    
}   
