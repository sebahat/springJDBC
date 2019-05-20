package com.JdbcDtoPattern.jdbcDto.controller;

import com.JdbcDtoPattern.jdbcDto.dto.UserDto;
import com.JdbcDtoPattern.jdbcDto.entity.User;
import com.JdbcDtoPattern.jdbcDto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping(path = "/getByUserName")
    public List<User> getUserName(@RequestBody String username) {
        return userService.findByUserName(username);
    }

    @PostMapping(path = "/addUser")
    public UserDto addUser(@RequestBody UserDto newUser) {
        return userService.addUser(newUser);
    }

}
