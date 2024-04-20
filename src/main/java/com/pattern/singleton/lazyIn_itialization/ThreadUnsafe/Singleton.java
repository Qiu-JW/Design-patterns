package com.pattern.singleton.lazyIn_itialization.ThreadUnsafe;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 懒汉式：线程不安全
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 申明类型
    private static Singleton singleton;

    // 提供公共访问方法，让外界获得对象
    public static Singleton getSingleton(){
        // 多个线程可能同时调用这个方法
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

}
