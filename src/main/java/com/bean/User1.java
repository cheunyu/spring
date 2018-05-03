package com.bean;

/**
 * @author:cheunyu
 * @date:2018/5/3 11:54
 * @deprecated: 构造方法实例化bean
 */
public class User1 {

    private String name;
    private int age;

    public void add() {
        System.out.println(this.getClass().getName()+ " add()");
    }

}
