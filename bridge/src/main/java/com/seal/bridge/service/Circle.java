package com.seal.bridge.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 08:55
 * @description 创建实现了 Shape 接口的实体类。
 **/
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
