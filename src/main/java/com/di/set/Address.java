package com.di.set;

/**
 * @author:cheunyu
 * @date:2018/5/6 0:54
 */
public class Address {

    private String addr;
    private int phoneNum;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
