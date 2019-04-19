package com.zbc.demo.proxy;

import java.lang.reflect.Proxy;

/**
 * @author zbc
 * @create 2019/4/19
 **/
public class ProxyTest {

    public static void main(String[] args) {
        IRentedRoom rentedRoom = new RentedRoomImpl();
        IRentedRoom proxy = (IRentedRoom) Proxy.newProxyInstance(rentedRoom.getClass().getClassLoader(), rentedRoom.getClass().getInterfaces(),
                new RentedRoomProxy(rentedRoom));

        proxy.rentedRoom();
    }
}
