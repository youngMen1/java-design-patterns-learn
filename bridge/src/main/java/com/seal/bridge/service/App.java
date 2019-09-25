package com.seal.bridge.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 08:59
 * @description 桥接模式
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 **/
public class App {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
