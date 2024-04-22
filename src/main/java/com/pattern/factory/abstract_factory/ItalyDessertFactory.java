package com.pattern.factory.abstract_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
//意大利风味甜点工厂
public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}