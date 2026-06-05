package com.vendor.vendorservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.vendorservice.model.CloudVendor;
import com.vendor.vendorservice.repository.VendorRepository;
import com.vendor.vendorservice.service.CloudVendorService;
@Service
public class CloudVendorServiceImplementation implements CloudVendorService {

    
    VendorRepository vendorRepository;
    
    public CloudVendorServiceImplementation(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        vendorRepository.save(cloudVendor);
        return "Cloud Vendor created successfully!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        vendorRepository.save(cloudVendor);
        return "Cloud Vendor updated successfully!";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
        return "Cloud Vendor deleted successfully!";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return vendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // TODO Auto-generated method stub
        return vendorRepository.findAll();}
    
}
