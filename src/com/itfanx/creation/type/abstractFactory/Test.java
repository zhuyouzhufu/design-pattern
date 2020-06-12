package com.itfanx.creation.type.abstractFactory;

/**
 * 测试类
 * @author fanx
 * @date 2020/6/12 12:58
 * @email itfanx@126.com
 */
public class Test {

    public static void main(String[] args) {
        BaseCourseFactory factory = new JavaCourseFactory();
        factory.getNote().read();
        factory.getViedo().play();

        factory = new GoCourseFactory();
        factory.getNote().read();
        factory.getViedo().play();

        factory = new FECourseFactory();
        factory.getNote().read();
        factory.getViedo().play();
    }
}
