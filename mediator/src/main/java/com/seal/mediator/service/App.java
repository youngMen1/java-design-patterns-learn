package com.seal.mediator.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 15:42
 * @description 中介者模式（Mediator Pattern）
 **/
public class App {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
