package com.capgemini.training.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleEmployeeNotFound(
            EmployeeNotFoundException ex,
            HttpServletRequest request){

        request.setAttribute("message", ex.getMessage());
        return "error";
    }

    @ExceptionHandler(InvalidInputException.class)
    public String handleInvalidInput(
            InvalidInputException ex,
            HttpServletRequest request){

        request.setAttribute("message", ex.getMessage());
        return "home";
    }

    // 🔥 Catch-all (very important)
    @ExceptionHandler(Exception.class)
    public String handleGeneralException(
            Exception ex,
            HttpServletRequest request){

        request.setAttribute("message", "Something went wrong!");
        return "home";
    }
}