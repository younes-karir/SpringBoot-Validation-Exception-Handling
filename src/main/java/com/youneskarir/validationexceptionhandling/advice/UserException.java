package com.youneskarir.validationexceptionhandling.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
public class UserException {

    @Getter
    private final String message;
    @Getter
    private final Throwable throwable;
    @Getter
    private final HttpStatus httpStatus;


}
