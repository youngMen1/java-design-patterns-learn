package com.seal.bridge.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 08:54
 * @description
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
