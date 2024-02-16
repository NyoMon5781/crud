package com.example.registrationlogindemo.service;

import java.util.List;

import com.example.registrationlogindemo.dto.UserDto;
import com.example.registrationlogindemo.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto>findAllUsers();
}