package com.jdbctemplate.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:cheunyu
 * @date:2018/5/8 21:44
 */
public class App {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Panda");
        user.setPassword("qwer12345");
        String xmlPath = "com/jdbctemplate/spring/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IUserDao userDaoImpl = (IUserDao) ctx.getBean("userDaoImpl");
        userDaoImpl.updateUser(user);
    }
}
