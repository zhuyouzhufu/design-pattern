package com.itfanx.creation.type.factoryMethod;

/**
 * 测试类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:59
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory javaViedoFactory =  new JavaVideoFactory();
        VideoFactory goViedoFactory =  new GoVideoFactory();
        VideoFactory feViedoFactory =  new FEVideoFactory();
        javaViedoFactory.getViedo().produce();
        goViedoFactory.getViedo().produce();
        feViedoFactory.getViedo().produce();
    }
}
