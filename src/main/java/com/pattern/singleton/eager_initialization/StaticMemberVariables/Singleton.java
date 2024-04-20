package com.pattern.singleton.eager_initialization.StaticMemberVariables;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 饿汉式：静态成员变量
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 在类中创建本类对象
    private static Singleton singleton =new Singleton();

    // 提供公共访问方法，让外界获得对象
    public static Singleton getSingleton(){
        return singleton;
    }

}
