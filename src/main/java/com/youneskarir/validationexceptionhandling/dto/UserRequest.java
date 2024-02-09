package com.youneskarir.validationexceptionhandling.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserRequest {

    private String name;
    private String address;
    private String email;
    private int age;
    private double salary;
}
