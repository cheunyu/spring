package com.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/2 21:40
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/di/collection/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        //set注入
        CollData collData = (CollData) ctx.getBean("colldata");
        System.out.println(collData.toString());
    }
}
