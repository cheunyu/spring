package com.jdbctemplate.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author:cheunyu
 * @date:2018/5/8 21:29
 */
public class JdbcTemplateExample {

    public static void main(String[] args) {


        BasicDataSource dataSource = new BasicDataSource(); //创建数据源dbcp
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("qwe123");


        JdbcTemplate jdbcTemplate = new JdbcTemplate(); //创建模板
        jdbcTemplate.setDataSource(dataSource);


        String sql = "insert into user values(1, 'panda','qwe123')";
        jdbcTemplate.execute(sql);
    }
}
