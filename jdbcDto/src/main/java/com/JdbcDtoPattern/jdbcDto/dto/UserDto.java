package com.JdbcDtoPattern.jdbcDto.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 4865903039190150223L;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
