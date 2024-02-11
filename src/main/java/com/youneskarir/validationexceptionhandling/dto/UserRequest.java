package com.youneskarir.validationexceptionhandling.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserRequest {

    @NotNull(message = "user name shouldn't be null")
    private String name;
    @NotNull(message = "user address shouldn't be null")
    private String address;
    @Email(message = "this is not a correct email id")
    private String email;
    @Min(value = 18,message = "the age is under 18")
    @Max(value = 65,message = "the age is over 65")
    private int age;
    private double salary;
}
