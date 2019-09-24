package com.seal.builder.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 20:01
 * @description 创建一个表示食物条目和食物包装的接口。
 **/
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
