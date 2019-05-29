package com.JdbcDtoPattern.jdbcDto.dto;

import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.Map;


public class AddBooksDto {
    Integer id;


    List<Books> books;

    public AddBooksDto(Integer id, List<Books> books) {
        this.id = id;
        this.books = books;
    }

    public AddBooksDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(final Map<String, List<Books>> books) {
        this.books = books.get("books");
    }
}
