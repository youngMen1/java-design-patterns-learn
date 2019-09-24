package com.seal.abstractfactory.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 19:06
 * @description
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
