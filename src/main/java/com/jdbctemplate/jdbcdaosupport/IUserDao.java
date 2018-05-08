package com.jdbctemplate.jdbcdaosupport;

import java.util.List;

public interface IUserDao {

    public void addUser(User user);

    public void deleteUser(User user);

    public void updateUser(User user);

    public List<User> findAll();
}
