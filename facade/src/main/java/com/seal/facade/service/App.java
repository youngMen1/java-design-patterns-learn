package com.seal.facade.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 11:25
 * @description 外观模式（Facade Pattern）
 * 使用该外观类画出各种类型的形状。
 **/
public class App {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
