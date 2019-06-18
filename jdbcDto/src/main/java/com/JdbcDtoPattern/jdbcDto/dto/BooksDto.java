package com.JdbcDtoPattern.jdbcDto.dto;

import com.JdbcDtoPattern.jdbcDto.entity.Author;

import java.util.ArrayList;
import java.util.List;

public class BooksDto {
    Integer id;

    String name;

    Boolean reserved;


    private List<Author> authors = new ArrayList<>();

    public BooksDto() {
    }

    public Integer getId() {
        return id;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BooksDto(String name, Integer id) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }
}
