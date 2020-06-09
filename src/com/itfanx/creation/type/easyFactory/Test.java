package com.itfanx.creation.type.easyFactory;

/**
 * 测试类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:59
 */
public class Test {
    public static void main(String[] args) {
        BaseViedo baseViedo = ViedoFactory.getViedo(JavaViedo.class);
        baseViedo.produce();
        baseViedo = ViedoFactory.getViedo(GoViedo.class);
        baseViedo.produce();
    }
}
