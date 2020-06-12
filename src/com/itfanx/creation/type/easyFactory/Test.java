package com.itfanx.creation.type.easyFactory;

/**
 * 测试类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:59
 */
public class Test {
    public static void main(String[] args) {
        BaseVideo baseViedo = VideoFactory.getViedo(JavaVideo.class);
        baseViedo.produce();
        baseViedo = VideoFactory.getViedo(GoVideo.class);
        baseViedo.produce();
    }
}
