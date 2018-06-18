package com.springboot2.start.exception;

import lombok.Data;

/**
 * @Description: 统一异常
 * @Author: xiongyongjie
 * @Date: 2018/6/18 8:23
 * @Version: v1.0
 **/
@Data
public class BisException extends RuntimeException {

    /**
     * 异常编码
     */
    private Integer code;
    /**
     * 异常消息处理
     */
    private String message;

    public BisException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }


}
