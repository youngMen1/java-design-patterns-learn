package com.seal.builder.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/24 20:00
 * @description 建造者模式（Builder Pattern）
 **/
public class App {
    public static void main(String[] args) {
        
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
