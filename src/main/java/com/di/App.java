package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/2 21:40
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student.toString());
    }
}
