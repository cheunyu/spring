package com.bean;

/**
 * @author:cheunyu
 * @date:2018/5/3 12:11
 * @deprecated:静态工厂方法实例化bean
 */
public class StaticFactory {

    public static User2 getInstance() {
        return new User2("panda",11);
    }
}
