package com.jdbctemplate.spring;

public interface IUserDao {

    public void addUser(User user);

    public void deleteUser(User user);

    public void updateUser(User user);

    public User queryUser();
}
