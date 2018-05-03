package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:41
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/beanscope/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Student student = (Student) ctx.getBean("student");
        Student studentOther = (Student) ctx.getBean("student");
        System.out.println(student);
        System.out.println(studentOther);
    }
}
