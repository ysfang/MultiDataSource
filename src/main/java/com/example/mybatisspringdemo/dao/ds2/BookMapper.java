package com.example.mybatisspringdemo.dao.ds2;

import com.example.mybatisspringdemo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookMapper {
    @Select("SELECT * FROM \"book\" WHERE id = #{id}")
    Book get(@Param("id") long id);

    @Select("SELECT * FROM \"book\"")
    List<Book> getAll();
}
