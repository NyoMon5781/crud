package com.example.registrationlogindemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationlogindemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}