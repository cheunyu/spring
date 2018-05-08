package com.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:56
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "/com/aop/aspectj/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IUserService userServiceImpl = (IUserService) ctx.getBean("userServiceImpl");
        userServiceImpl.addUser();
        userServiceImpl.findUser();
        userServiceImpl.deleteUser();
    }
}
