package com.aop.cglib;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:38
 */
public class App {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = BeanFactory.getUserService();
        userServiceImpl.addUser();
        userServiceImpl.deleteUser();
        userServiceImpl.findUser();
    }
}
