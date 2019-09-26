package com.seal.visitor.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/26 11:39
 * @description 定义一个表示元素的接口。
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
