package com.seal.bridge.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 08:54
 * @description 创建实现了 DrawAPI 接口的实体桥接实现类。
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}