package com.JdbcDtoPattern.jdbcDto.service;

import com.JdbcDtoPattern.jdbcDto.dto.BooksDto;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.repository.BooksRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {
    @Autowired
    BooksRepository bookRepository;

    ModelMapper modelMapper = new ModelMapper();

    public Optional<Books> getBook(Integer id) {
        return bookRepository.findById(id);
    }

    public Books saveBook(BooksDto book) {
        Books books = modelMapper.map(book, Books.class);
        return bookRepository.save(books);
    }


    public Books update(BooksDto book) {
        Optional<Books> booksNew = bookRepository.findById(book.getId());
        Books bookDb = booksNew.get();
        bookDb.setReserved(true);
        return bookRepository.save(bookDb);
    }


    public List<Books> getFilterAuthorName(String authorName) {
        return bookRepository.getFilterAuthorName(authorName);
    }

}
