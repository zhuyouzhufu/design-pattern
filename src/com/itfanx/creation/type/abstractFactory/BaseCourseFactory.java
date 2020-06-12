package com.itfanx.creation.type.abstractFactory;

/**
 * 课程工厂
 * @author fanx
 * @date 2020/6/12 12:41
 * @email itfanx@126.com
 * 抽象工厂设计模式
 */
public abstract class BaseCourseFactory {

    /**
     * 获得视频对象
     * @return      BaseVideo
     */
    public abstract BaseVideo getViedo();

    /**
     * 获得笔记对象
     * @return      BaseNote
     */
    public abstract BaseNote getNote();
}
