package com.JdbcDtoPattern.jdbcDto.controller;

import com.JdbcDtoPattern.jdbcDto.dto.AuthorDto;
import com.JdbcDtoPattern.jdbcDto.entity.Author;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.dto.AddBooksDto;
import com.JdbcDtoPattern.jdbcDto.service.AuthorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping(path = "/saveAuthor")
    public Author saveAuthor(@RequestBody AuthorDto author) {
        return authorService.saveAuthor(author);
    }


    //TODO last adding pagination
    @GetMapping(path = "/getAllAuthors")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthors();
    }

    @PostMapping(path = "/addBooks")
    public String addBook(@RequestBody String requestBody) throws IOException {
        return "";
        // authorService.updateBooks(request.getId(), request.getBooks());
    }


}
