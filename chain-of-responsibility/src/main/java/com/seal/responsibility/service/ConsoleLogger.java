package com.seal.responsibility.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 14:32
 * @description
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
