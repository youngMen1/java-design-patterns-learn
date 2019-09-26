package com.seal.state.state.service;


/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:47
 * @description
 **/
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}