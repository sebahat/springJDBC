package com.JdbcDtoPattern.jdbcDto.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
