package com.pattern.factory.abstract_factory_better;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
//美式下午茶工厂
public class AmericanAfternoonTeaFactory implements AfternoonTeaFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}