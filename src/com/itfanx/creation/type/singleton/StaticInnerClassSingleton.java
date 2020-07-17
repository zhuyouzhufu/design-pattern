package com.itfanx.creation.type.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * 单例模式：基于类初始化延迟加载的实现方式
 * @author fanx
 * @date 2020/7/17 12:46
 * @email itfanx@126.com
 * 单例模式
 */
public class StaticInnerClassSingleton{
    public static StaticInnerClassSingleton getInstance = InnerClass.staticInnerClassSingleton;

    private StaticInnerClassSingleton(){
        if(getInstance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static class InnerClass{
        public static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static class T implements Runnable{

        @Override
        public void run() {
            StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance;
            System.out.println(singleton);
        }
    }

    public static void main(String[] args) {
        new Thread(new T()).start();
        new Thread(new T()).start();
    }
}
