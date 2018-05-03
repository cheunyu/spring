package com.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/2 20:19
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        String xmlPath = "com/helloworld/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);  //创建Spring的IOC容器对象
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld"); //从IOC容器中获取Bean实例
        Thread.sleep(3000);
        helloWorld.hello();
    }
}
