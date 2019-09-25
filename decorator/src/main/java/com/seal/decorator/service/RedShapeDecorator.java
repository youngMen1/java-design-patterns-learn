package com.seal.decorator.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 11:11
 * @description 创建扩展了 ShapeDecorator 类的实体装饰类。
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
