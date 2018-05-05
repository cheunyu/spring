package com.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:41
 * @deprecated:destory在关闭容器，web时执行
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/beanpostprocessor/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Student student = (Student) ctx.getBean("student");
        Student student1 = (Student) ctx.getBean("student");
        student.doSomething();
        student1.doSomething();
        System.out.println(student);
        System.out.println(student1);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
