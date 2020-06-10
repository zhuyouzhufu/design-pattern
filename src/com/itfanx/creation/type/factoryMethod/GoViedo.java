package com.itfanx.creation.type.factoryMethod;

/**
 * Go视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：简单工厂(不属于23种GOF设计模式)
 */
public class GoViedo extends BaseViedo {
    @Override
    public void produce() {
        System.out.println("正在录制Go视频");
    }
}
