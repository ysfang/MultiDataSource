package com.example.mybatisspringdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.example.mybatisspringdemo.dao.ds2", sqlSessionFactoryRef = "sqlSessionFactoryBean2")
public class DataSource2Config {
    @Bean(name = "datasource2")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource datasource2() throws SQLException {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactoryBean2")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(datasource2());
        return sqlSessionFactoryBean.getObject();
    }
}
