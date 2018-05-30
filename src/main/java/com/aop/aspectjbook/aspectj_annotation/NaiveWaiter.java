package com.aop.aspectjbook.aspectj_annotation;

/**
 * @author:cheunyu
 * @date:2018/5/30 23:31
 */
public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("NaiveWaiter:greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {

    }
}
