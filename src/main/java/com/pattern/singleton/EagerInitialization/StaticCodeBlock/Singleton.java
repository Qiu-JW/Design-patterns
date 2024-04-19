package com.pattern.singleton.EagerInitialization.StaticCodeBlock;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 饿汉式：静态代码块
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 申明Singleton类型变量
    private static Singleton singleton ;
    static {
        singleton=new Singleton();
    }
    // 提供公共访问方法，让外界获得对象
    public static Singleton getSingleton(){
        return singleton;
    }

}
