package com.seal.abstractfactory.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 18:59
 * @description
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
