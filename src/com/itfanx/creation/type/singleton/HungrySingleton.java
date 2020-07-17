package com.itfanx.creation.type.singleton;

/**
 * 饿汉模式
 * 单纯的饿汉模式无法预防反射破坏、序列化反序列化破坏、构造器破坏
 * @author fanx
 * @date 2020/7/17 12:56
 * @email itfanx@126.com
 * 单例模式
 */
public class HungrySingleton {
    private static final HungrySingleton SINGLETON = new HungrySingleton();

    private HungrySingleton(){}

    /**
     * 获得单例对象
     * @return  HungrySingleton
     */
    public static HungrySingleton getInstance(){
        return SINGLETON;
    }

    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
