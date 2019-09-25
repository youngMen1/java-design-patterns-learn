package com.seal.interpreter.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 15:12
 * @description
 **/
public interface Expression {
    boolean interpret(String context);
}
