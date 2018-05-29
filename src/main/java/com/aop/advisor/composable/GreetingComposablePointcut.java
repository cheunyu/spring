package com.aop.advisor.composable;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * @author:cheunyu
 * @date:2018/5/29 16:56
 */
public class GreetingComposablePointcut {
    public Pointcut getIntersectionPointcut() {
        ComposablePointcut composablePointcut = new ComposablePointcut();   //创建一个复合切点
        Pointcut pointcut = new ControlFlowPointcut(WaiterDelegate.class, "service");   //船舰一个流程切点
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();    //创建一个方法名切点
        nameMatchMethodPointcut.addMethodName("greetTo");
        return composablePointcut.intersection(pointcut).intersection((Pointcut) nameMatchMethodPointcut); //两个切点进行交集操作
    }
}
