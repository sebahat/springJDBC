package com.JdbcDtoPattern.jdbcDto.controller;

import com.JdbcDtoPattern.jdbcDto.dto.BooksDto;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Optional;

@RestController
public class BooksController {
    @Autowired
    BooksService bookService;

    @GetMapping(path = "/getBook/{id}")
    public Optional<Books> getBook(@PathVariable("id") Integer id) {
        return bookService.getBook(id);
    }

    @PostMapping(path = "/saveBook")
    public Books saveBook(@RequestBody BooksDto bookdto) {
        return bookService.saveBook(bookdto);
    }

    @PostMapping(path = "/updateStatus")
    public Books updateStatus(@RequestBody BooksDto booksDto) {
        return bookService.update(booksDto);
    }


}
