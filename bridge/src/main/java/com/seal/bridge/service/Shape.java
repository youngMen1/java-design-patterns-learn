package com.seal.bridge.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 08:55
 * @description 使用 DrawAPI 接口创建抽象类 Shape。
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}