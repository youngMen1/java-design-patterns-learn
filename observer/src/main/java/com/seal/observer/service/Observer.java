package com.seal.observer.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 16:20
 * @description 创建 Observer 类。
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
