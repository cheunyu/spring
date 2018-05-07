package com.aop.spring;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:34
 */
public class UserServiceImpl implements IUserService {

    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }

    @Override
    public void findUser() {
        System.out.println("findUser");
    }
}
