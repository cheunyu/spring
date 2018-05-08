package com.jdbctemplate.spring;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author:cheunyu
 * @date:2018/5/8 21:42
 */
public class UserDaoImpl implements IUserDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set username=?,password=? where id=?";
        Object[] args = {user.getName(), user.getPassword(), user.getId()};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public User queryUser() {
        return null;
    }
}
