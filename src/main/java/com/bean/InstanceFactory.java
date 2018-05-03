package com.bean;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:17
 * @deprecated:实例工厂方法实例化bean
 */
public class InstanceFactory {

    public User3 getUser3() {
        return new User3("panda", 111);
    }
}
