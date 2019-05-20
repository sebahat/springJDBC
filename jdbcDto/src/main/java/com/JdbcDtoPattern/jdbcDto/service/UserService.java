package com.JdbcDtoPattern.jdbcDto.service;

import com.JdbcDtoPattern.jdbcDto.dto.UserDto;
import com.JdbcDtoPattern.jdbcDto.entity.User;
import com.JdbcDtoPattern.jdbcDto.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;


    public List<User> findByUserName(String userName) {
        return repository.findByUserName(userName);
    }


    public UserDto addUser(UserDto newUser) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(newUser, User.class);
        return modelMapper.map(repository.save(user), UserDto.class);
    }

}
