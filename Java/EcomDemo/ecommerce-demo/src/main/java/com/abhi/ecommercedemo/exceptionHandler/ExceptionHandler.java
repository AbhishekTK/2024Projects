package com.abhi.ecommercedemo.exceptionHandler;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

    // @ExceptionHandler(value 
    //   = { IllegalArgumentException.class, IllegalStateException.class })
    // protected ResponseEntity<Object> handleConflict(
    //   RuntimeException ex, WebRequest request) {
    //     String bodyOfResponse = "This should be application specific";
    //     return handleExceptionInternal(ex, bodyOfResponse, 
    //       new HttpHeaders(), HttpStatus.CONFLICT, request);
    // }
}
