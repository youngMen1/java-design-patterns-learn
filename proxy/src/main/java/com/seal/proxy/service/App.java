package com.seal.proxy.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 14:06
 * @description 代理模式（Proxy Pattern）
 **/
public class App {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("------------");
        // 图像不需要从磁盘加载
        image.display();
    }
}
