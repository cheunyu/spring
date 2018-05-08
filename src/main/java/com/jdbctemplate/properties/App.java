package com.jdbctemplate.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/5/8 21:44
 */
public class App {

    public static void main(String[] args) {
        User user = new User();
        user.setId(3);
        user.setName("Panda");
        user.setPassword("123123123");
        String xmlPath = "com/jdbctemplate/properties/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IUserDao userDaoImpl = (IUserDao) ctx.getBean("userDaoImpl");
//        userDaoImpl.addUser(user);
//        userDaoImpl.updateUser(user);
        List<User> userList = userDaoImpl.findAll();
        for (User userdb: userList) {
            System.out.println(userdb.toString());
        }
        User user2 = userDaoImpl.getById(2);
        System.out.println(user2.toString());
    }
}
