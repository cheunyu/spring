package com.aop.jdkproxy;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:36
 */
public class Aspect {

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }
}
