package com.aop.aspectjbook.aspectj_annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author:cheunyu
 * @date:2018/5/30 23:22
 */
@Aspect
public class TestAspect {

    @AfterReturning("@annotation(com.aop.aspectjbook.aspectj_annotation.NeedTest)") //后置增强切面
    public void neetTestFun() {
        System.out.println("needTestFun() executed!");
    }
}
