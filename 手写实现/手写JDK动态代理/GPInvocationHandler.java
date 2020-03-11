package com.lkp.demo.test.two.five.three.gp;

import java.lang.reflect.Method;

/**
 * @author: LKP
 * @date: 2020/3/11
 */
public interface GPInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
