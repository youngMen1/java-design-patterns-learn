package com.seal.flyweight.service;

import java.util.HashMap;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 13:58
 * @description
 **/
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
