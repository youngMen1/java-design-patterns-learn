package com.seal.nullobject.nullobject.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:57
 * @description 创建一个抽象类。
 **/
public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}
