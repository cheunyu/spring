package com.jdbctemplate.properties;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/5/8 21:42
 */
public class UserDaoImpl extends JdbcDaoSupport implements IUserDao {

    @Override
    public void addUser(User user) {
        String sql = "insert into user(id, name, password) values(?,?,?)";
        getJdbcTemplate().update(sql, user.getId(), user.getName(), user.getPassword());
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set name=?,password=? where id=?";
        Object[] args = {user.getName(), user.getPassword(), user.getId()};
        this.getJdbcTemplate().update(sql, args);
    }

    @Override
    public List<User> findAll() {
        return this.getJdbcTemplate().query("select * from user", new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public User getById(int i) {
        return getJdbcTemplate().queryForObject("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), i);
    }

}
