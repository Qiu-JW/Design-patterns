package com.pattern.factory.abstract_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public interface DessertFactory {
    // 生产咖啡功能
    Coffee createCoffee();
    // 生产甜品
    Dessert createDessert();
}
