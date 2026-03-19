package com.capgemini.training.Exception;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String message){
        super(message);
    }
}