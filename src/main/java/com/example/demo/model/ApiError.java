package com.example.demo.model;

import org.springframework.http.HttpStatus;

public class ApiError {

    private HttpStatus httpStatus;

    private String message;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ApiError setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiError setMessage(String message) {
        this.message = message;
        return this;
    }
}
