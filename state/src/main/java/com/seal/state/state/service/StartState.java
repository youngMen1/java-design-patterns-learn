package com.seal.state.state.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:47
 * @description 开始状态
 **/
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于开始状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "开始状态";
    }
}
