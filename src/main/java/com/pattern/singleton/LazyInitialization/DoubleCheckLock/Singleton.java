package com.pattern.singleton.LazyInitialization.DoubleCheckLock;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 懒汉式：双重检查锁
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 申明Singleton类型变量
    private static volatile Singleton singleton ;

    // 提供公共访问方法，让外界获得对象
    public static Singleton getSingleton(){
        // 将锁放在了里面 而不是方法
        if (singleton ==null){
            synchronized (Singleton.class) {
                //抢到锁之后再次判断是否为null
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
