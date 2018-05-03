package com.bean;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:14
 */
public class User3 {

    private String name;
    private int age;

    public User3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
