package com.JdbcDtoPattern.jdbcDto.repository;

import com.JdbcDtoPattern.jdbcDto.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
