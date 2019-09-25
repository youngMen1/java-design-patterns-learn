package com.seal.command.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 14:43
 * @description 命令模式（Command Pattern）
 **/
public class App {

    public static void main(String[] args) {

        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
