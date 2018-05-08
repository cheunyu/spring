package com.aop.autohalf;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:34
 */
public class UserServiceImpl implements IUserService {

    @Override
    public void addUser() {
        System.out.println("addUser 方法");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser 方法");
    }

    @Override
    public void findUser() {
        System.out.println("findUser 方法");
    }
}
