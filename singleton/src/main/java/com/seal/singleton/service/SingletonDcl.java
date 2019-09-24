package com.seal.singleton.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 19:46
 * @description
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 **/
public class SingletonDcl {

    private volatile static SingletonDcl singleton;

    private SingletonDcl() {
    }

    public static SingletonDcl getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDcl.class) {
                if (singleton == null) {
                    singleton = new SingletonDcl();
                }
            }
        }
        return singleton;
    }
}
