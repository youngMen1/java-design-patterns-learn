package com.seal.iterator.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 15:34
 * @description 迭代器模式（Iterator Pattern）
 **/
public class App {
    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
