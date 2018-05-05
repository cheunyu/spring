package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author:cheunyu
 * @date:2018/5/6 2:57
 */
@Service("userServiceImpl")    //Service层注解
public class UserServiceImpl implements IUserService{

    private IUserDao userDaoImpl;

    @Autowired
    @Qualifier("userDaoImpl")   //按名称注解
    public void setUserDaoImpl(IUserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public void service() {
        System.out.println("userServiceImpl doSomething");
        userDaoImpl.saveUser();
    }
}
