package com.aop.aspectjannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author:cheunyu
 * @date:2018/5/7 17:58
 */
@Component("aspect")
@org.aspectj.lang.annotation.Aspect
public class Aspect {



    @Before("execution(* com.aop.aspectjannotation..*.*(..))")
    public void aopBefore() {
        System.out.println("前置通知");
    }

    /**
     * @description:定义切入点方法引用，方法名任意
     * @param:[]
     * @return:void
     */
    @Pointcut("execution(* com.aop.aspectjannotation..*.*(..))")
    public void share() {

    }

    /**
     * @description:注解一个参数value默认隐藏，方法名引用切入点
     * @param:[joinPoint, object]
     * @return:void
     */
    @AfterReturning(value = "share()", returning = "object")
    public void aopAfterReturning(JoinPoint joinPoint, Object object) {
        System.out.println("后置通知" + joinPoint.getSignature().getName());
        System.out.println("目标方法返回 " + object);
    }

    @Around(value = "share()")
    public Object aopAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知before");
        Object obj = proceedingJoinPoint.proceed(); //手动执行目标方法
        System.out.println("环绕通知after");
        return obj;
    }

    @AfterThrowing(value = "share()", throwing = "e")
    public void aopAfterThrowing(Throwable e) {
        System.out.println("抛出异常通知 " +e.getMessage());
    }

    @After("execution(* com.aop.aspectjannotation..*.*(..))")
    public void aopAfter() {
        System.out.println("最终通知");
    }
}
