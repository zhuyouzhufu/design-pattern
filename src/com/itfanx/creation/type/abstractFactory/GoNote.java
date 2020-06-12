package com.itfanx.creation.type.abstractFactory;

/**
 * Go笔记
 * @author fanx
 * @date 2020/6/12 12:53
 * @email itfanx@126.com
 * 抽象工厂设计模式
 */
public class GoNote extends BaseNote{
    @Override
    public void read() {
        System.out.println("正在阅读Go笔记");
    }
}
