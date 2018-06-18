package com.springboot2.start.vo;

import lombok.Data;

/**
 * @Description: 统一返回结果vo
 * @Author: xiongyongjie
 * @Date: 2018/6/18 8:39
 * @Version: v1.0
 **/
@Data
public class ResultData {
    /**
     * 构造方法
     * @param code
     * @param message
     * @param data
     */
    public ResultData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 返回结果编码
     */
    private Integer code;
    /**
     * 返回结果
     */
    private String message;
    /**
     * 返回结果数据
     */
    private Object data;

}

