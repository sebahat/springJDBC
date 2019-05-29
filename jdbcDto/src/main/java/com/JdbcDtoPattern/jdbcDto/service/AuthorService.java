package com.JdbcDtoPattern.jdbcDto.service;

import com.JdbcDtoPattern.jdbcDto.dto.AuthorDto;
import com.JdbcDtoPattern.jdbcDto.entity.Author;
import com.JdbcDtoPattern.jdbcDto.entity.Books;
import com.JdbcDtoPattern.jdbcDto.entity.User;
import com.JdbcDtoPattern.jdbcDto.repository.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    ModelMapper modelMapper = new ModelMapper();

    public Author saveAuthor(AuthorDto author) {
        Author newAuthor = modelMapper.map(author, Author.class);
        return authorRepository.save(newAuthor);
    }

    public Optional<Author> getAuthor(int id) {
        return authorRepository.findById(id);

    }

    public Author updateBooks(int id, List<Books> books) {
        Author author = getAuthor(id).get();
        author.setAuthorBooks(books);
        return authorRepository.save(author);
    }

    public List<Author>getAllAuthors(){
        return (List<Author>) authorRepository.findAll();
    }


}
