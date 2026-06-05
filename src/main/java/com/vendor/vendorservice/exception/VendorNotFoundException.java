package com.vendor.vendorservice.exception;

public class VendorNotFoundException extends RuntimeException {

    public VendorNotFoundException(String message) {
        super(message);
    }
    public VendorNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
    
}
