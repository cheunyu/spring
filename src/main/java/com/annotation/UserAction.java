package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author:cheunyu
 * @date:2018/5/6 2:52
 */
@Controller("userAction")   //web层注解
@Scope("prototype") //多例注解
public class UserAction {

    @Autowired  //按照类型注解
    private IUserService userServiceImpl;

    public void execute() {
        System.out.println("userAction doSomething");
        userServiceImpl.service();
    }

    @PostConstruct
    public void userInit(){
        System.out.println("userAction init method()");
    }

    @PreDestroy
    public void userDestory() {
        System.out.println("userAction destory method()");
    }
}
