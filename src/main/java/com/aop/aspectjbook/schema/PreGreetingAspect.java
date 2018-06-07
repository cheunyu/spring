package com.aop.aspectjbook.schema;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author:cheunyu
 * @date:2018/5/30 19:58
 */
public class PreGreetingAspect {

    public void beforeGreeting() {  //增强横切逻辑
        System.out.println("how are you");
    }
}
