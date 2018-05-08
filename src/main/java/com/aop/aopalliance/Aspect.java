package com.aop.aopalliance;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:58
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
