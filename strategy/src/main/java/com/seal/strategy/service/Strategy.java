package com.seal.strategy.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:11
 * @description 定义一个策略接口
 **/
public interface Strategy {
    /**
     * 定义一个策略接口
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
