package com.seal.strategy.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:10
 * @description 策略模式
 **/
public class App {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
