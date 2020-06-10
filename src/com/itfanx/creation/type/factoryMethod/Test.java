package com.itfanx.creation.type.factoryMethod;

/**
 * 测试类
 * @author itfanx
 * @email itfanx@126.com
 * @date 2020-06-09 23:59
 */
public class Test {
    public static void main(String[] args) {
        ViedoFactory javaViedoFactory =  new JavaViedoFactory();
        ViedoFactory goViedoFactory =  new GoViedoFactory();
        ViedoFactory feViedoFactory =  new FEViedoFactory();
        javaViedoFactory.getViedo().produce();
        goViedoFactory.getViedo().produce();
        feViedoFactory.getViedo().produce();
    }
}
