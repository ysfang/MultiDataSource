package com.example.mybatisspringdemo.controller;

import com.example.mybatisspringdemo.dao.ds1.UserMapper;
import com.example.mybatisspringdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @RequestMapping("/{id}")
    public User get(@PathVariable("id") long id) {
        return userMapper.get(id);
    }

}
