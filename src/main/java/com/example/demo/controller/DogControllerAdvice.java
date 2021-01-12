package com.example.demo.controller;

import com.example.demo.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class DogControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DogException.class)
    protected ResponseEntity<ApiError> handleEntityNotFound(DogException ex) {

        return ResponseEntity.badRequest()
                .body(new ApiError()
                        .setHttpStatus(HttpStatus.BAD_REQUEST)
                        .setMessage("Hey you broke it, please reference error code 2343234"));
    }
}
