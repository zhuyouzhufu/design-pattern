package com.itfanx.creation.type.factoryMethod;

/**
 * 前端视频类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：工厂方法
 */
public class FEViedo extends BaseViedo {
    @Override
    public void produce() {
        System.out.println("正在录制FE视频");
    }
}
