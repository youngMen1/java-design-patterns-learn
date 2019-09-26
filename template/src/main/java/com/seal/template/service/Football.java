package com.seal.template.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:29
 * @description
 **/
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}