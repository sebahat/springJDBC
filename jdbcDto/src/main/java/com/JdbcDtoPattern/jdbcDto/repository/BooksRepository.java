package com.JdbcDtoPattern.jdbcDto.repository;

import com.JdbcDtoPattern.jdbcDto.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
