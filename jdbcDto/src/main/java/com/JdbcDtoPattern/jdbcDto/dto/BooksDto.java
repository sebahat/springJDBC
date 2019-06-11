package com.JdbcDtoPattern.jdbcDto.dto;
public class BooksDto {
    String name;

    public BooksDto() {
    }

    public BooksDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
