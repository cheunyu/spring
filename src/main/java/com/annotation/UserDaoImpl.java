package com.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author:cheunyu
 * @date:2018/5/6 3:00
 */
@Repository("userDaoImpl") //Dao层注解
public class UserDaoImpl implements IUserDao{
    @Override
    public void saveUser() {
        System.out.println("userDaoImpl doSomething");
    }
}
