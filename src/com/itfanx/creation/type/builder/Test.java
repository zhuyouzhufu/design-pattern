package com.itfanx.creation.type.builder;

/**
 * 测试对象
 * @author fanx
 * @date 2020/7/6 13:13
 * @email itfanx@126.com
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        ResultVO<String> resultVO = new ResultVO<>();
        resultVO = resultVO.resultBuilder.code(200).data("123").message("这是一个消息内容").build();
        System.out.println(resultVO);
    }

}
