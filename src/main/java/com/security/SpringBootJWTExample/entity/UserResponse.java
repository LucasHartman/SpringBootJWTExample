package com.security.SpringBootJWTExample.entity;

public class UserResponse {

    private String token;
    private String message;

    public UserResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }
}