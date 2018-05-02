package com.helloworld;

/**
 * @author:cheunyu
 * @date:2018/5/2 20:16
 */
public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld构造方法");
    }

    public void setName(String name) {
        System.out.println("IOC注入属性");
        this.name = name;
    }

    public void hello() {
        System.out.println("hello " + name);
    }
}
