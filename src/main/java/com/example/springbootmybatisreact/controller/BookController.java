package com.example.springbootmybatisreact.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootmybatisreact.entity.Book;
import com.example.springbootmybatisreact.entity.BookTag;
import com.example.springbootmybatisreact.service.BookService;
import com.example.springbootmybatisreact.service.BookTagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
@Slf4j
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookTagService bookTagService;

    @GetMapping("/getBooks")
    public List<Book> getBooks(){

        return bookService.getBooks();

    }

    @GetMapping("/getAllTags")
    public List<BookTag> getAllTags(){

        return bookTagService.getAllBookTags();

    }

    @GetMapping("/getAllBooks")
    public List<BookTag> getAllBooks(){

        return bookTagService.getAllBooks();

    }

}
