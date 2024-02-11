package com.youneskarir.validationexceptionhandling.controller;


import com.youneskarir.validationexceptionhandling.dto.UserRequest;
import com.youneskarir.validationexceptionhandling.modal.User;
import com.youneskarir.validationexceptionhandling.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody @Valid UserRequest userRequest){
        return userService.createUser(userRequest);
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
