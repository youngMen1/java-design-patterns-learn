package com.seal.abstractfactory.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 19:08
 * @description
 **/
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
