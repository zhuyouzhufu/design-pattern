package com.itfanx.creation.type.builder;

/**
 * 返回VO类
 * @author fanx
 * @date 2020/7/6 12:56
 * @email itfanx@126.com
 * 建造者模式
 */
public class ResultVO<T> {
    /**
     * 状态码
     */
    private int code;

    /**
     * 返回的消息信息
     */
    private String message;

    /**
     * 返回类VO建造者对象
     */
    public transient ResultBuilder resultBuilder = new ResultBuilder();

    /**
     * 返回的数据
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * 返回VO类建造者
     * @author fanx
     * @date 2020/7/6 13:00
     * @email itfanx@126.com
     * 建造者模式
     */
    public class ResultBuilder {

        public ResultBuilder code(int code) {
            ResultVO.this.code = code;
            return this;
        }

        public ResultBuilder message(String message) {
            ResultVO.this.message = message;
            return this;
        }

        public ResultBuilder data(T data) {
            ResultVO.this.data = data;
            return this;
        }


        public ResultVO<T> build(){
            return (ResultVO<T>) ResultVO.this;
        }
    }

}
