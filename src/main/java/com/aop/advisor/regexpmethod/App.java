package com.aop.advisor.regexpmethod;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/28 16:13
 */
public class App {

    @Test
    public void before() {
        String xmlPath = "com/aop/advisor/regexpmethod/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter1");
//        Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("Panda");
        waiter.serveTo("Panda");
//        seller.greetTo("Panda");
    }
}
