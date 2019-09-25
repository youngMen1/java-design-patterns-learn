package com.seal.responsibility.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 14:33
 * @description
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
