package com.JdbcDtoPattern.jdbcDto.dto;

public class AuthorDto {
    String name;

    String surname;


    public AuthorDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
