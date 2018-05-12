package com.example.mybatisspringdemo.dao.dao1;

import com.example.mybatisspringdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    @Select("SELECT * FROM \"user\" WHERE id = #{id}")
    User get(@Param("id") long id);

    @Select("SELECT * FROM \"user\"")
    List<User> getAll();
}
