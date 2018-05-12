package com.example.mybatisspringdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.example.mybatisspringdemo.dao.ds1", sqlSessionFactoryRef = "sqlSessionFactoryBean1")
public class DataSource1Config {
    public static final String TXN_MANAGER = "txnManager";

    @Bean(name = "datasource1")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource1")
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = TXN_MANAGER)
    @Primary
    public PlatformTransactionManager txnManager() {
        return new DataSourceTransactionManager(dataSource1());
    }

    @Bean(name = "sqlSessionFactoryBean1")
    @Primary
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource1());
        return sqlSessionFactoryBean.getObject();
    }
}
