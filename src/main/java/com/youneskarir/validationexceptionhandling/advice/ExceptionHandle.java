package com.youneskarir.validationexceptionhandling.advice;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleException(MethodArgumentNotValidException exceptions){
        Map<String,String> errors = new HashMap<>();
        exceptions.getBindingResult().getFieldErrors().forEach(
                item -> errors.put(item.getField(),item.getDefaultMessage())
        );
        return errors;
    }


    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<Object> HandleUserNotFoundException
            (UserNotFoundException userNotFoundException){

        UserException userException = new UserException(
                userNotFoundException.getMessage(),
                userNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(userException,HttpStatus.NOT_FOUND);
    }
}

