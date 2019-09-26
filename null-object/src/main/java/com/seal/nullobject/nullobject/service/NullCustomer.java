package com.seal.nullobject.nullobject.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:58
 * @description
 **/
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
