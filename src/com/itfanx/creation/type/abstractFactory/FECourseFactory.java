package com.itfanx.creation.type.abstractFactory;

/**
 * FE课程工厂
 * @author fanx
 * @date 2020/6/12 12:48
 * @email itfanx@126.com
 * 抽象工厂设计模式
 */
public class FECourseFactory extends BaseCourseFactory{
    @Override
    public BaseVideo getViedo() {
        return new FEViedo();
    }

    @Override
    public BaseNote getNote() {
        return new FENote();
    }
}
