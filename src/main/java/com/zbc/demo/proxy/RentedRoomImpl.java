package com.zbc.demo.proxy;

/**
 * @author zbc
 * @create 2019/4/19
 **/
public class RentedRoomImpl implements IRentedRoom {

    @Override
    public void rentedRoom() {
        System.out.println("rented room");
    }
}
