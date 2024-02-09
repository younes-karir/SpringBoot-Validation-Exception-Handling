package com.youneskarir.validationexceptionhandling.repository;

import com.youneskarir.validationexceptionhandling.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
