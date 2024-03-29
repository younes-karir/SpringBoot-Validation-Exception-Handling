package com.youneskarir.validationexceptionhandling.service.impl;


import com.youneskarir.validationexceptionhandling.advice.UserNotFoundException;
import com.youneskarir.validationexceptionhandling.dto.UserRequest;
import com.youneskarir.validationexceptionhandling.modal.User;
import com.youneskarir.validationexceptionhandling.repository.UserRepository;
import com.youneskarir.validationexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequest userRequest) {
        User user = User.builder()
                .name(userRequest.getName())
                .address(userRequest.getAddress())
                .email(userRequest.getEmail())
                .age(userRequest.getAge())
                .salary(userRequest.getSalary())
                .build();
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {

        if(userRepository.findById(id).isEmpty())
            throw new UserNotFoundException("user not found");
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
