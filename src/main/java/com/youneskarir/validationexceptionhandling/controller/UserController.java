package com.youneskarir.validationexceptionhandling.controller;


import com.youneskarir.validationexceptionhandling.modal.User;
import com.youneskarir.validationexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable(name = "id") Long id){
        return userService.getUser(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }



}
