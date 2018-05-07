package com.aop.auto;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:55
 */
public class UserServiceImpl implements IUserService{
    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void findUser() {
        System.out.println("find user");
    }

    @Override
    public void deleteUser() {
        System.out.println("del user");
    }
}
