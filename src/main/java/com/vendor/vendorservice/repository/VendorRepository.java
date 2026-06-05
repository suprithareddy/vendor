package com.vendor.vendorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendor.vendorservice.model.CloudVendor;

public interface VendorRepository extends JpaRepository<CloudVendor, String> {
    
}
