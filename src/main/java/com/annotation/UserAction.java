package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author:cheunyu
 * @date:2018/5/6 2:52
 */
@Controller("userAction")   //web层注解
public class UserAction {

    @Autowired  //按照类型注解
    private IUserService userServiceImpl;

    public void execute() {
        System.out.println("userAction doSomething");
        userServiceImpl.service();
    }
}
