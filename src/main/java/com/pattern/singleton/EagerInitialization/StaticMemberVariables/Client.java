package com.pattern.singleton.EagerInitialization.StaticMemberVariables;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Client {
    public static void main(String[] args) {
        //  获取singleton对象
        Singleton singleton=Singleton.getSingleton();
        Singleton singleton1=Singleton.getSingleton();
        // 结果为true 这表示
        System.out.println(singleton1==singleton);
    }
}
