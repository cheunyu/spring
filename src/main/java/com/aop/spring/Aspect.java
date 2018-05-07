package com.aop.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:36
 */
public class Aspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");
        methodInvocation.proceed();
        System.out.println("after");
        return null;
    }
}
