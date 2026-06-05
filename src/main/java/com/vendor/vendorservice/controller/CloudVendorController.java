package com.vendor.vendorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendor.vendorservice.model.CloudVendor;
import com.vendor.vendorservice.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendors")
public class CloudVendorController {
    
    
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping()
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully!";
    }
    
    @PutMapping()
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
       
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor deleted successfully!";
    }
    

}
