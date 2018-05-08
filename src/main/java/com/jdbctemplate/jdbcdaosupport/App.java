package com.jdbctemplate.jdbcdaosupport;

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
        user.setId(2);
        user.setName("Panda");
        user.setPassword("1111");
        String xmlPath = "com/jdbctemplate/jdbcdaosupport/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IUserDao userDaoImpl = (IUserDao) ctx.getBean("userDaoImpl");
        userDaoImpl.addUser(user);
//        userDaoImpl.updateUser(user);
        List<User> userList = userDaoImpl.findAll();
        for (User userdb: userList) {
            System.out.println(userdb.toString());
        }
    }
}
