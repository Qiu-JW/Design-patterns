package com.pattern.factory.factory_method;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new AmericanCoffee();
    }
}
