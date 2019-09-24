package com.seal.builder.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 20:07
 * @description
 **/
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}