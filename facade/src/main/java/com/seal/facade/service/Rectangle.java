package com.seal.facade.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 11:47
 * @description
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
