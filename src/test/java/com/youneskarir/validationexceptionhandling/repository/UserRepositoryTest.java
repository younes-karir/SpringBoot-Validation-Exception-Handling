package com.youneskarir.validationexceptionhandling.repository;

import com.youneskarir.validationexceptionhandling.modal.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;


    @Test
    public void create(){
        User user = User.builder()
                .name("younes karir")
                .address("Beni Mellal")
                .email("youneskarir@gmail.com")
                .age(25)
                .salary(10000)
                .build();

        userRepository.save(user);

    }

}