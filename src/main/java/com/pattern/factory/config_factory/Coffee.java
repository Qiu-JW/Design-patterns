package com.pattern.factory.config_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public abstract class Coffee {
    public abstract String getName();
    // 加糖
    public void addSugar(){
        System.out.println("加糖");
    }
    // 加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
