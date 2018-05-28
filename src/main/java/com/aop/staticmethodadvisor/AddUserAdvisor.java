package com.aop.staticmethodadvisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/23 15:24
 */
public class AddUserAdvisor extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return "addUser".equals(method.getName());
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return UserService.class.isAssignableFrom(aClass);
            }
        };
    }
}
