package com.pattern.factory.abstract_factory_better;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
//意大利风味下午茶工厂
public class ItalyAfternoonTeaFactory implements AfternoonTeaFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}