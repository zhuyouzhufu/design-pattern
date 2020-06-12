package com.itfanx.creation.type.factoryMethod;

/**
 * 录像工厂类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：工厂方法
 */
public interface VideoFactory {

    /**
     * 获取视频对象
     * @return  BaseViedo
     */
    BaseVideo getViedo();

}
