package com.itfanx.creation.type.easyFactory;

/**
 * Java视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：简单工厂(不属于23种GOF设计模式)
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("正在录制Java视频");
    }
}
