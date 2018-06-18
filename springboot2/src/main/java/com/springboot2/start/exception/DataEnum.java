package com.springboot2.start.exception;

import lombok.Getter;

/**
 * @Description:  数据统一处理消息
 * @Author: xiongyongjie
 * @Date: 2018/6/18 8:44
 * @Version: v1.0
 **/

@Getter
public enum DataEnum {

    DATA_SUCCESS(0,"数据返回成功"),
    DATA_ERROR(-1,"数据处理异常")
    ;


    private int code;
    private String msg;
    DataEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


}
