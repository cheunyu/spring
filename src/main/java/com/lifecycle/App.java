package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:41
 * @deprecated:destory在关闭容器，web时执行
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/lifecycle/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Student student = (Student) ctx.getBean("student");
        student.doSomething();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
