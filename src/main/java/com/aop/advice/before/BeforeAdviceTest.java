package com.aop.advice.before;

import org.junit.jupiter.api.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author:cheunyu
 * @date:2018/5/28 15:50
 */
public class BeforeAdviceTest {

    @Test
    public void before() {
        Waiter target = new NavieWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        //Spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置代理目标
        proxyFactory.setTarget(target);
        //为代理目标添加增强
        proxyFactory.addAdvice(advice);
        //启用优化代理方式，使用CglibAopProxy
        proxyFactory.setOptimize(true);
        //生成代理实例
        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Panda");
    }
}
