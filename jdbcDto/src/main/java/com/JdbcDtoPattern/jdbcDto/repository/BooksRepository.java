package com.JdbcDtoPattern.jdbcDto.repository;

import com.JdbcDtoPattern.jdbcDto.entity.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Integer> {

    @Query(value = "SELECT books.id,books.name,books.reserved FROM library.author as author,library.author_books as jointable ,library.books as books \n" +
            "WHERE author.name =:authorName GROUP BY books.id ;", nativeQuery = true)
    List<Books> getFilterAuthorName(@Param("authorName") String authorName);

}
