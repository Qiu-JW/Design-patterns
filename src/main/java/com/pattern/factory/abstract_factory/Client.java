package com.pattern.factory.abstract_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class Client {
    public static void main(String[] args) {
        // 不同工厂
        // ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        // 甜品
        Coffee coffee= factory.createCoffee();
        // 咖啡
        Dessert dessert=factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
