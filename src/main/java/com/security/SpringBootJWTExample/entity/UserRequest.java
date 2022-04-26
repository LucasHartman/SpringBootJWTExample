package com.security.SpringBootJWTExample.entity;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;
}