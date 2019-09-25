package com.seal.mediator.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 15:52
 * @description
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
