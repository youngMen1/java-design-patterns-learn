package com.seal.singleton.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 19:37
 * @description 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，
 * 所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 **/
public class SingletonLazyUnsafe {

    private static SingletonLazyUnsafe instance;

    private SingletonLazyUnsafe() {
    }

    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
