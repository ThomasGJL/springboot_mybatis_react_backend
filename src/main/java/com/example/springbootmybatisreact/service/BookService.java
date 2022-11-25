package com.example.springbootmybatisreact.service;

import com.example.springbootmybatisreact.entity.Book;
import com.example.springbootmybatisreact.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getBooks(){

        return bookMapper.getBooks();

    }
}
