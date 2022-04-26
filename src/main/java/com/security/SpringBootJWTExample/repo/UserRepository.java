package com.security.SpringBootJWTExample.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.SpringBootJWTExample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}