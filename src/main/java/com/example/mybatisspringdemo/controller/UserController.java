package com.example.mybatisspringdemo.controller;

import com.example.mybatisspringdemo.dao.UserMapper;
import com.example.mybatisspringdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @RequestMapping("/{id}")
    public User get(@PathVariable("id") long id) {
        return userMapper.get(id);
    }

}
