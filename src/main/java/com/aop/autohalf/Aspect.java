package com.aop.autohalf;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:36
 */
public class Aspect implements MethodInterceptor, MethodBeforeAdvice {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知before");
        methodInvocation.proceed();
        System.out.println("环绕通知after");
        return null;
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知before");
        method.invoke(o, objects);
        System.out.println("前置通知after");
    }
}
