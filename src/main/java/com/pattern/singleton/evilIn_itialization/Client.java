package com.pattern.singleton.evilIn_itialization;


import com.pattern.singleton.lazyIn_itialization.DoubleCheckLock.Singleton;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Client {
    public static void main(String[] args) {
        //  获取singleton对象
        Singleton singleton= Singleton.getSingleton();
        Singleton singleton1= Singleton.getSingleton();
        // 结果为true 这表示
        System.out.println(singleton1==singleton);
    }
}
