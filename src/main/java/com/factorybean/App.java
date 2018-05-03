package com.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:25
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/factorybean/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Object obj = ctx.getBean("factory");
        System.out.println(obj.toString());
    }
}
