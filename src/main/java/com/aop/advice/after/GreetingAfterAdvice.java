package com.aop.advice.after;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/28 16:36
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

    //在目标类方法调用后执行
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("Please enjoy yourself!");
    }
}
