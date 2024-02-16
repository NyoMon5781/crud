package com.example.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationlogindemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}