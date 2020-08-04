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

    private HungrySingleton(){
        if(SINGLETON != null){
            throw new RuntimeException("禁止使用构造器反射构造单例对象");
        }
    }

    /**
     * 防止序列化反序列化破坏单例模式
     * @return  Object
     */
    public Object readResolve(){
        return SINGLETON;
    }

    /**
     * 获得单例对象
     * 备注：饿汉式不需要使用双重校验锁获取单例对象，
     * 因为该对象在类加载时只有一个线程能够初始化单例对象，因为有类锁的缘故，所以是线程安全的
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
