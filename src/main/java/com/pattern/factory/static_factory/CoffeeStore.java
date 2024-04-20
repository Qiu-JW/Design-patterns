package com.pattern.factory.static_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        // SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        // Coffee coffee=simpleCoffeeFactory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        // 配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
