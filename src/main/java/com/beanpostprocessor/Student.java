package com.beanpostprocessor;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:46
 */
public class Student {


    public Student() {
        System.out.println("构造方法");
    }

    public void myInit() {
        System.out.println("init method 初始化方法");
    }

    public void destory() {
        System.out.println("destory method bean销毁回收方法");
    }

    public void doSomething() {
        System.out.println("业务方法");
    }
}
