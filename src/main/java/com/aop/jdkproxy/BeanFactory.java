package com.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:cheunyu
 * @date:2018/5/7 10:38
 */
public class BeanFactory {

    public static IUserService getUserService() {
        final IUserService userServiceImpl = new UserServiceImpl();
        final Aspect aspect = new Aspect();
        IUserService proxyUserService = (IUserService) Proxy.newProxyInstance(
                BeanFactory.class.getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                aspect.before();
                Object obj = method.invoke(userServiceImpl, args);
                aspect.after();
                return obj;
            }
        });
        return proxyUserService;
    }
}
