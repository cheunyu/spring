package com.aop.aspectjbook.aspectj_annotation;

/**
 * @author:cheunyu
 * @date:2018/5/30 23:24
 */
public class NaughtyWaiter implements Waiter{
    @Override
    @NeedTest
    public void greetTo(String name) {
        System.out.println("NaughtyWaiter:greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {

    }
}
