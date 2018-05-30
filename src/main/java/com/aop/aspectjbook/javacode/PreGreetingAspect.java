package com.aop.aspectjbook.javacode;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author:cheunyu
 * @date:2018/5/30 19:58
 */
@Aspect //通过注解将PreGreetingAspect标识为一个切面
public class PreGreetingAspect {

    @Before("execution(* greetTo(..))") //定义切点和增强类型
    public void beforeGreeting() {  //增强横切逻辑
        System.out.println("how are you");
    }
}
