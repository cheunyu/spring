package com.aop.advisor.controlflow;

/**
 * @author:cheunyu
 * @date:2018/5/29 16:29
 */
public class WaiterDelegate {

    private Waiter waiter;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    //waiter的方法通过该方法发起调用
    public void service(String clientName) {
        waiter.greetTo(clientName);
        waiter.serveTo(clientName);
    }
}
