package com.aop.advisor.dynamicmethod;

import com.aop.advisor.staticmethodmatcher.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcher;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/5/28 19:46
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {

    private static List<String> specialClientList = new ArrayList<String>();
    static {
        specialClientList.add("Panda");
        specialClientList.add("foo");
    }

    public boolean matches(Method method, Class clazz) {
        System.out.println("调用matches(method, clazz)"+clazz.getName()+"."+method.getName()+"做静态检查。");
        return "greetTo".equals(method.getName());
    }

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        System.out.println("调用matches(method, clazz)"+aClass.getName()+"."+method.getName()+"做动态检查。");
        return specialClientList.contains(objects.toString());
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getClassFilter()对"+aClass.getName()+"做静态检查。");
                return com.aop.advisor.dynamicmethod.Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
}
