package com.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Description;

/**
 * @author:cheunyu
 * @date:2018/5/5 22:59
 */
public class PostProcessorExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor before method" + s);  //在init-method之前执行
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor after method" + s);   //在init-method之后执行
        return o;
    }
}
