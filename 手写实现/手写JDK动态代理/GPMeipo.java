package com.lkp.demo.test.two.five.three.gp;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: LKP
 * @date: 2020/3/11
 */
public class GPMeipo implements GPInvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    public Object getInstance(Object target){
        this.target = target;

        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }

    public void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确定你的需求");
        System.out.println("开始物色");
    }

    public void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
