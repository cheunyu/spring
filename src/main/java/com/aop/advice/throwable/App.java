package com.aop.advice.throwable;

import com.aop.advice.before.Waiter;
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
        String xmlPath = "com/aop/advice/throwable/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        forumService.removeForum(1);
    }
}
