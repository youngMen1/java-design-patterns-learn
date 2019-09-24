package com.seal.abstractfactory.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 19:00
 * @description
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
