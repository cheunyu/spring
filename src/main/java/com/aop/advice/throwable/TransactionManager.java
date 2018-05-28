package com.aop.advice.throwable;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * @author:cheunyu
 * @date:2018/5/28 15:49
 */
public class TransactionManager implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        System.out.println("method:" + method.getName());
        System.out.println("抛出异常: " +ex.getMessage());
        System.out.println("成功回滚事务");
    }
}
