package com.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:38
 */
public class BeanFactory {

    public static UserServiceImpl getUserService() {
        final UserServiceImpl userServiceImpl = new UserServiceImpl();
        final Aspect aspect = new Aspect();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userServiceImpl.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                aspect.before();
                method.invoke(userServiceImpl, objects);
                aspect.after();
                return null;
            }
        });
        UserServiceImpl userServiceImplProxy = (UserServiceImpl) enhancer.create();
        return userServiceImplProxy;
    }
}
