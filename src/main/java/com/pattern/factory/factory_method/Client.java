package com.pattern.factory.factory_method;


/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class Client {
    public static void main(String[] args) {
        // 咖啡店类
        CoffeeStore store=new CoffeeStore();
        //  工厂类对象 使用转型来适配
        CoffeeFactory factory = new LatteCoffeeFactory();
        // CoffeeFactory factory = new AmericanCoffeeFactory();
        //
        store.setCoffeeFactory(factory);

        // 点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
