package com.pattern.factory.before;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/20
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee=null;
        if ("美式".equals(type)){
            coffee=new AmericanCoffee();
        }else  if("拿铁".equals(type)){
            coffee =new LatteCoffee();
        }else {
            throw new RuntimeException("没有这种咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
