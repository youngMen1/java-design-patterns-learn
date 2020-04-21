package com.seal.state.state.service;


/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:47
 * @description 停止状态
 **/
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于停止状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "停止状态";
    }
}