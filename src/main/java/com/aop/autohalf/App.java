package com.aop.autohalf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:38
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/aop/autohalf/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IUserService userServiceImpl = (IUserService) ctx.getBean("proxyUserService");
        userServiceImpl.addUser();
//        userServiceImpl.deleteUser();
//        userServiceImpl.findUser();
    }
}
