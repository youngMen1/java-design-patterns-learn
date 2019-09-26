package com.seal.state.state.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 10:42
 * @description
 **/
public class App {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

    }
}
