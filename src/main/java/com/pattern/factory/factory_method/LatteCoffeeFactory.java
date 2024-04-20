package com.pattern.factory.factory_method;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 * 专门用来生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new LatteCoffee();
    }
}
