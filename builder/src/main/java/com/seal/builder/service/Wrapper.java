package com.seal.builder.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 20:02
 * @description 创建实现 Packing 接口的实体类。
 **/
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
