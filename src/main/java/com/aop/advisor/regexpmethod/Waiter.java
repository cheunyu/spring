package com.aop.advisor.regexpmethod;

/**
 * @author:cheunyu
 * @date:2018/5/28 19:44
 */
public class Waiter {

    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }
}
