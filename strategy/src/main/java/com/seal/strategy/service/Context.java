package com.seal.strategy.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:13
 * @description Context算法调用类，根据具体策略对象调用相应的方法
 **/
public class Context {

    private Strategy strategy;

    /**
     * 有参的构造方法
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
