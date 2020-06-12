package com.itfanx.creation.type.abstractFactory;


/**
 * 前端视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 抽象工厂设计模式
 */
public class FEViedo extends BaseVideo {
    @Override
    public void play() {
        System.out.println("开始播放FE视频");
    }
}
