package com.aop.staticmethodadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:56
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "/com/aop/staticmethodadvisor/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) ctx.getBean("userServiceTarget");
        userService.addUser();
    }
}
