package com.annotation;

import com.bean.User1;
import com.bean.User2;
import com.bean.User3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:03
 */
public class App {

    public static void main(String[] args) {
        String xmlPath = "com/annotation/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        UserAction userAction = (UserAction) ctx.getBean("userAction");
        UserAction userAction1 = (UserAction) ctx.getBean("userAction");
        userAction.execute();
        System.out.println(userAction);
        System.out.println(userAction1);
        ((ClassPathXmlApplicationContext) ctx).close();
    }


}
