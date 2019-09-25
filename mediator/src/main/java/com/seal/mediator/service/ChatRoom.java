package com.seal.mediator.service;

import java.util.Date;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 15:51
 * @description
 **/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
