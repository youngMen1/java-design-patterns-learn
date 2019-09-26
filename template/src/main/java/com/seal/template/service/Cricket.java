package com.seal.template.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:28
 * @description 创建扩展了上述类的实体类。
 **/
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}