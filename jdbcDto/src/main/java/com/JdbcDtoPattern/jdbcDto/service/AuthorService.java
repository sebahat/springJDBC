package com.JdbcDtoPattern.jdbcDto.service;

import com.JdbcDtoPattern.jdbcDto.dto.AuthorDto;
import com.JdbcDtoPattern.jdbcDto.dto.BooksDto;
import com.JdbcDtoPattern.jdbcDto.entity.Author;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.repository.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    ModelMapper modelMapper = new ModelMapper();
    java.lang.reflect.Type targetListType = new TypeToken<List<Books>>() {
    }.getType();

    public Author saveAuthor(AuthorDto author) {
        Author newAuthor = modelMapper.map(author, Author.class);
        return authorRepository.save(newAuthor);
    }

    public Optional<Author> getAuthor(int id) {
        return authorRepository.findById(id);

    }

    public Author updateBooks(int id, List<BooksDto> booksdto) {

        Author author = getAuthor(id).get();
        List<Books> books = modelMapper.map(booksdto, targetListType);
        author.addBooks(books);


        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }


}
