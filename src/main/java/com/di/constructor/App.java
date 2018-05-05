package com.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/2 21:40
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/di/constructor/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Student student = (Student) ctx.getBean("student");
        System.out.println(student.toString());
    }
}
