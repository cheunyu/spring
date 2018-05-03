package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:03
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/bean/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        User1 user1 = (User1) ctx.getBean("user1");
        User2 user2 = (User2) ctx.getBean("user2");
        System.out.println(user2.toString());
        User3 user3 = (User3) ctx.getBean("user3");
        System.out.println(user3.toString());
    }

}
