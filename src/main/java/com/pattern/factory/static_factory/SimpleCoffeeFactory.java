package com.pattern.factory.static_factory;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 * 咖啡工厂类 用来生产咖啡
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        Coffee coffee=null;
        if ("美式".equals(type)){
            coffee=new AmericanCoffee();
        }else  if("拿铁".equals(type)){
            coffee =new LatteCoffee();
        }else {
            throw new RuntimeException("没有这种咖啡");
        }
        return coffee;
    }
}
