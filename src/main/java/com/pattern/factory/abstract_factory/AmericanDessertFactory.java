package com.pattern.factory.abstract_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
//美式甜点工厂
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}