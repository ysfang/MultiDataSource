package com.example.mybatisspringdemo.controller;

import com.example.mybatisspringdemo.dao.BookMapper;


import com.example.mybatisspringdemo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/")
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @RequestMapping("/{id}")
    public Book get(@PathVariable("id") long id) {
        return bookMapper.get(id);
    }

}