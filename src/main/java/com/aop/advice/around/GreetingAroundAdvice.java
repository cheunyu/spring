package com.aop.advice.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @author:cheunyu
 * @date:2018/5/28 16:36
 */
public class GreetingAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();    //目标方法入参
        String clientName = (String)args[0];
        System.out.println("How are you!Mr." + clientName); //目标方法执行前调用
        Object obj = methodInvocation.proceed();    //通过反射机制调用目标方法
        System.out.println("Please enjoy yourself!");   //目标方法执行后调用
        return obj;
    }
}
