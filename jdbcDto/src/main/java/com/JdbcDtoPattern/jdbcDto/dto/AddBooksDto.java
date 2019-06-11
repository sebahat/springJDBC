package com.JdbcDtoPattern.jdbcDto.dto;

import com.JdbcDtoPattern.jdbcDto.entity.Books;

import java.util.List;


public class AddBooksDto {
    Integer id;

    List<BooksDto> books;

    public AddBooksDto(Integer id, List<BooksDto> books) {
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

    public List<BooksDto> getBooks() {
        return books;
    }

    public void setBooks(List<BooksDto> books) {
        this.books = books;
    }
}
