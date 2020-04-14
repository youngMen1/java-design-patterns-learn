package com.seal.observer.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 16:20
 * @description 观察者模式
 **/
public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();

        // 存放观察者们
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
