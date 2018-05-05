package com.di.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/2 21:40
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/di/set/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        //set注入
        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());
    }
}
