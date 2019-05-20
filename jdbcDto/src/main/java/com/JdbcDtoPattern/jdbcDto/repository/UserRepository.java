package com.JdbcDtoPattern.jdbcDto.repository;

import com.JdbcDtoPattern.jdbcDto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    @Query("SELECT u FROM User u WHERE u.username=:username")
    List<User> findByUserName(@Param("username") String username);
}
