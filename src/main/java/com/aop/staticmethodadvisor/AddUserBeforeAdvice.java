package com.aop.staticmethodadvisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/23 15:27
 */
public class AddUserBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"."+method.getName());
    }
}
