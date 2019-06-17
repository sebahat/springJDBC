package com.JdbcDtoPattern.jdbcDto.controller;

import com.JdbcDtoPattern.jdbcDto.dto.AuthorDto;
import com.JdbcDtoPattern.jdbcDto.dto.BooksDto;
import com.JdbcDtoPattern.jdbcDto.dto.UserDto;
import com.JdbcDtoPattern.jdbcDto.entity.Author;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.dto.AddBooksDto;
import com.JdbcDtoPattern.jdbcDto.entity.User;
import com.JdbcDtoPattern.jdbcDto.service.AuthorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;
import java.awt.print.Book;
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

    //TODO last adding pagination change crud repository
    @GetMapping(path = "/getAllAuthors")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthors();
    }
    //important :Cascade Type PERSİST so books add existing book
    @PostMapping(path = "/addBooks")
    public Author addBook(@RequestBody AddBooksDto dto) {
        return authorService.updateBooks(dto.getId(), dto.getBooks());
    }


}
