package com.aop.jdkproxy;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:38
 */
public class App {

    public static void main(String[] args) {
        IUserService userServiceImpl = BeanFactory.getUserService();
        userServiceImpl.addUser();
        userServiceImpl.deleteUser();
        userServiceImpl.findUser();
    }
}
