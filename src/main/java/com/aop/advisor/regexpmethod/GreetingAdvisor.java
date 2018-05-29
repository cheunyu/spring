package com.aop.advisor.regexpmethod;

import com.aop.advisor.staticmethodmatcher.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author:cheunyu
 * @date:2018/5/28 19:46
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class<?> aClass) {
        return "greetTo".equals(method.getName());
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
}
