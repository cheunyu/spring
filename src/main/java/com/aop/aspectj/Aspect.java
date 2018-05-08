package com.aop.aspectj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:58
 */
public class Aspect {

    public void aopBefore() {
        System.out.println("前置通知");
    }

    public void aopAfterReturning(JoinPoint joinPoint, Object object) {
        System.out.println("后置通知" + joinPoint.getSignature().getName());
        System.out.println("目标方法返回 " + object);
    }

    public Object aopAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知before");
        Object obj = proceedingJoinPoint.proceed(); //手动执行目标方法
        System.out.println("环绕通知after");
        return obj;
    }

    public void aopAfterThrowing(Throwable e) {
        System.out.println("抛出异常通知 " +e.getMessage());
    }

    public void aopAfter() {
        System.out.println("最终通知");
    }
}
