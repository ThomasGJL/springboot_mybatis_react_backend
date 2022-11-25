package com.example.springbootmybatisreact.mapper;

import com.example.springbootmybatisreact.entity.BookTag;

import java.util.List;

public interface BookTagMapper {

    List<BookTag> getAllTags();

    List<BookTag> getAllBooks();

}


