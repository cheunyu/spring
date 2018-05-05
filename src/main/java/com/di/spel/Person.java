package com.di.spel;

/**
 * @author:cheunyu
 * @date:2018/5/6 0:53
 */
public class Person {

    private String name;
    private int age;
    private Address homeAddr;
    private Address companyAddr;
    private double pi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(Address homeAddr) {
        this.homeAddr = homeAddr;
    }

    public Address getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(Address companyAddr) {
        this.companyAddr = companyAddr;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeAddr=" + homeAddr +
                ", companyAddr=" + companyAddr +
                ", pi=" + pi +
                '}';
    }
}
