package com.ecom.exceptions;

public class ProductNotFoundException extends Exception {
    private String message;
    public ProductNotFoundException(String message) {
        this.message = message;
    }
}
