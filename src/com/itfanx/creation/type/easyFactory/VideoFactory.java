package com.itfanx.creation.type.easyFactory;

/**
 * 录像工厂类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：简单工厂(不属于23种GOF设计模式)
 */
public class VideoFactory {

    /**
     * 获得视频对象
     * @return  BaseViedo
     */
    public static BaseVideo getViedo(Class clz){
        try {
            BaseVideo viedo = (BaseVideo) clz.newInstance();
            return viedo;
        } catch (Exception e) {
            throw new RuntimeException("传入的参数类不是BaseViedo的子类");
        }
    }
}
