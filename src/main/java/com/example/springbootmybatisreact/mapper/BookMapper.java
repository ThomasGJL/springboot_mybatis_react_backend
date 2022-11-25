package com.example.springbootmybatisreact.mapper;

import com.example.springbootmybatisreact.entity.Book;

import java.util.List;

//@Mapper
public interface BookMapper {

    //@Select("select * from book")
    List<Book> getBooks();


}
