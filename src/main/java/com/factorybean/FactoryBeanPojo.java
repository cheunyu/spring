package com.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author:cheunyu
 * @date:2018/5/4 0:32
 * @deprecated:FactoryBeanPojo类实现FactoryBean接口实例化的对象不是自身，而是getObject()方法返回的对象
 */
public class FactoryBeanPojo implements FactoryBean {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object getObject() throws Exception {
        if ("student".equals(type)) {
            return new Student();
        }else if ("teacher".equals(type)) {
            return new Teacher();
        }
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
