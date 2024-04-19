package com.pattern.singleton.LazyInitialization.ThreadSafe;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 申明类型
    private static Singleton singleton;

    // 提供公共访问方法，让外界获得对象
    public static synchronized Singleton getSingleton(){
        // 多个线程可能同时调用这个方法
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

}
