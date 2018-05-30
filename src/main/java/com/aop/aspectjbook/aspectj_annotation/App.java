package com.aop.aspectjbook.aspectj_annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/30 21:43
 */
public class App {

    @Test
    public void before() {
        String xmlPath = "/com/aop/aspectjbook/aspectj_annotation/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("Panda");
        naughtyWaiter.greetTo("foo");
    }
}
