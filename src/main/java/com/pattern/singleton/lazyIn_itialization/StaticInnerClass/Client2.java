package com.pattern.singleton.lazyIn_itialization.StaticInnerClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 * 序列化破坏
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        // writeObject2File();
        // 这样打印出来的地址不一样
        readObjectFromFile();
        readObjectFromFile();
    }
    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        Singleton singleton = Singleton.getSingleton();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
        //将instance对象写出到文件中
        oos.writeObject(singleton);
    }
    private static Singleton readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\a.txt"));
        //第一个读取Singleton对象
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        ois.close();
        return singleton;
    }
}
