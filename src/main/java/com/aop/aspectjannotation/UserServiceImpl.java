package com.aop.aspectjannotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:55
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
    @Override
    public String addUser() {
        System.out.println("add user");
        return "add user success";
    }

    @Override
    public void findUser() {
        System.out.println("find user");
        int i = 1/0;
    }

    @Override
    public void deleteUser() {
        System.out.println("del user");
    }
}
