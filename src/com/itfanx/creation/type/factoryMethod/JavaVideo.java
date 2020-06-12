package com.itfanx.creation.type.factoryMethod;

/**
 * Java视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：工厂方法
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("正在录制Java视频");
    }
}
