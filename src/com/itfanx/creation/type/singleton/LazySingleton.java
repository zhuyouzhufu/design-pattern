package com.itfanx.creation.type.singleton;

/**
 * 懒汉模式
 * 注：懒汉模式天生无法处理构造破坏的问题。他只能处理反射破坏、序列化反序列化破坏
 * @author fanx
 * @date 2020/7/17 12:53
 * @email itfanx@126.com
 * 单例模式
 */
public class LazySingleton {
    public static LazySingleton SINGLETON;

    private LazySingleton(){
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

    public static LazySingleton getInstance(){
        if(SINGLETON == null){
            synchronized (LazySingleton.class){
                if(SINGLETON == null){
                    SINGLETON = new LazySingleton();
                }
            }
        }
        return SINGLETON;
    }
}
