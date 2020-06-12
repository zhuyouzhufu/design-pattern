package com.itfanx.creation.type.abstractFactory;

/**
 * Go视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 抽象工厂设计模式
 */
public class GoViedo extends BaseVideo {
    @Override
    public void play() {
        System.out.println("开始播放Go视频");
    }
}
