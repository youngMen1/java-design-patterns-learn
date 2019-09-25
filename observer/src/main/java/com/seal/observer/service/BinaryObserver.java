package com.seal.observer.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 16:21
 * @description 创建实体观察者类。
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
