package com.abhi.ecommercedemo.exception;

public class ResourceNotFoundException extends RuntimeException {

    // private static final long serialVersionUID = ;
    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

    public ResourceNotFoundException(final Throwable cause) {
        super(cause);
    }

}
