package com.ecom.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends Exception {
    private int errorCode;
    private String message;
    public ProductNotFoundException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
