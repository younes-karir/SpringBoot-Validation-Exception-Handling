package com.youneskarir.validationexceptionhandling.service.impl;


import com.youneskarir.validationexceptionhandling.modal.User;
import com.youneskarir.validationexceptionhandling.repository.UserRepository;
import com.youneskarir.validationexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User removeUser(User user) {
        userRepository.delete(user);
        return user;
    }
}
