package com.security.SpringBootJWTExample.service;

import java.util.Optional;

import com.security.SpringBootJWTExample.entity.User;

public interface IUserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);
}