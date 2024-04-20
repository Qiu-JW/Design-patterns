package com.pattern.factory.sinple_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class Client {
    public static void main(String[] args) {
        // 咖啡店类
        CoffeeStore store=new CoffeeStore();
        Coffee coffee=store.orderCoffee("美式");

        System.out.println(coffee.getName());
    }
}
