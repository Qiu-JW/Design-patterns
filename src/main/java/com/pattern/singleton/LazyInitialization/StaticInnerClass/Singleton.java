package com.pattern.singleton.LazyInitialization.StaticInnerClass;

import java.io.Serializable;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 懒汉式：双重检查锁
 */
public class Singleton implements Serializable {
    // 私有构造方法
    private Singleton(){}
    // 申明Singleton类型变量
    private static volatile Singleton singleton ;

    // 定义静态内部类
    private static  class  SingletonHolder{
        // 在内部类中申明并初始化外部类对象
        private static  final  Singleton singleton=new Singleton();
    }
    // 提供公共访问方法，让外界获得对象
    public  static  Singleton getSingleton(){
        return  SingletonHolder.singleton;
    }

}
