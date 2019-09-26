package com.seal.nullobject.nullobject.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:57
 * @description 创建扩展了上述类的实体类。
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
