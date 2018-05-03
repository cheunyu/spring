package com.bean;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:10
 */
public class User2 {

    private String name;
    private int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
