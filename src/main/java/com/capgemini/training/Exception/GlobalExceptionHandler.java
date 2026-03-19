package com.capgemini.training.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleNotFound(EmployeeNotFoundException ex){

        Map<String,Object> error = new HashMap<>();
        error.put("message", ex.getMessage());
        error.put("status", 404);

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<Map<String,Object>> handleInvalid(InvalidInputException ex){

        Map<String,Object> error = new HashMap<>();
        error.put("message", ex.getMessage());
        error.put("status", 400);

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,Object>> handleGeneral(Exception ex){

        Map<String,Object> error = new HashMap<>();
        error.put("message", "Something went wrong");
        error.put("status", 500);

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}