package com.youneskarir.validationexceptionhandling.service;

import com.youneskarir.validationexceptionhandling.dto.UserRequest;
import com.youneskarir.validationexceptionhandling.modal.User;

import java.util.List;

public interface UserService {


    public User createUser(UserRequest userRequest);
    public User getUser(Long id);
    public List<User> getAll();
    public User updateUser(User user);
    public User removeUser(User user);
}
