package com.lifecycle;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:46
 */
public class Student {


    public Student() {
        System.out.println("构造方法");
    }

    public void myInit() {
        System.out.println("初始化方法");
    }

    public void destory() {
        System.out.println("bean销毁回收方法");
    }

    public void doSomething() {
        System.out.println("业务方法");
    }
}
