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
    public static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
