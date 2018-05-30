package com.aop.aspectjbook.aspectj_example.javacode;

import org.junit.jupiter.api.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author:cheunyu
 * @date:2018/5/30 20:16
 */
public class AspectJProxyTest {

    @Test
    public void before() {
        Waiter waiter = new NavieWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        //设置目标对象
        factory.setTarget(waiter);
        //添加切面类
        factory.addAspect(PreGreetingAspect.class);
        //生成织入切面的代理对象
        Waiter proxy = factory.getProxy();
        proxy.greetTo("Panda");
        proxy.serveTo("foo");
    }
}
