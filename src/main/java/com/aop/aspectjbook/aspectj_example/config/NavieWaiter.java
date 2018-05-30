package com.aop.aspectjbook.aspectj_example.config;


/**
 * @author:cheunyu
 * @date:2018/5/28 15:47
 */
public class NavieWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }
}
