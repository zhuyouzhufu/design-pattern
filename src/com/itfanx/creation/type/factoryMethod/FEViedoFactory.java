package com.itfanx.creation.type.factoryMethod;

/**
 * 前端视频工厂类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:44
 * 备注：工厂方法
 */
public class FEViedoFactory implements ViedoFactory {

    @Override
    public BaseViedo getViedo(){
        return new FEViedo();
    }
}
