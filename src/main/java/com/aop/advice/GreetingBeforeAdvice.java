package com.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/28 15:49
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName = (String)objects[0];
        System.out.println("How are you!Mr." + clientName);
    }
}
