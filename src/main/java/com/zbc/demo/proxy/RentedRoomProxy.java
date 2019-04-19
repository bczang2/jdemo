package com.zbc.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zbc
 * @create 2019/4/19
 **/
public class RentedRoomProxy implements InvocationHandler {

    private Object target;

    public RentedRoomProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rented room");
        Object result = method.invoke(this.target, args);
        System.out.println("after rented room");
        return result;
    }
}
