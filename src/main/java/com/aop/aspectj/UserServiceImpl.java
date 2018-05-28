package com.aop.aspectj;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:55
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String addUser() {
        System.out.println("add user");
        return "add user success";
    }

    @Override
    public void findUser() {
        System.out.println("find user");
//        int i = 1/0;
    }

    @Override
    public void deleteUser() {
        System.out.println("del user");
    }
}
