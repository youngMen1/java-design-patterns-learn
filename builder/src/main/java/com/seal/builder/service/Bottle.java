package com.seal.builder.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 20:03
 * @description
 **/
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
