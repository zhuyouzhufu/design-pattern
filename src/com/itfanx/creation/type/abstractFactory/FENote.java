package com.itfanx.creation.type.abstractFactory;

/**
 * FE笔记
 * @author fanx
 * @date 2020/6/12 12:53
 * @email itfanx@126.com
 * 抽象工厂设计模式
 */
public class FENote extends BaseNote{
    @Override
    public void read() {
        System.out.println("正在阅读FE笔记");
    }
}
