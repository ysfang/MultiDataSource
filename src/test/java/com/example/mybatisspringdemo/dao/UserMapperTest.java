package com.example.mybatisspringdemo.dao;


import com.example.mybatisspringdemo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void testGetAll(){
        List<User> li = mapper.getAll();
        assertThat(li.size(), is(equalTo(3)));
    }

}
