package com.aop.autoproxy.defaultadvisorautoproxycreator;

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
        String xmlPath = "com/aop/autoproxy/defaultadvisorautoproxycreator/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        Waiter waiter = (Waiter) ctx.getBean("waiterTarget");
        Seller seller = (Seller) ctx.getBean("sellerTarget");
        waiter.greetTo("Panda");
        waiter.serveTo("Panda");
        seller.greetTo("Panda");
    }
}
