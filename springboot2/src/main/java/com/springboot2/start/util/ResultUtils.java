package com.springboot2.start.util;

import com.springboot2.start.exception.DataEnum;
import com.springboot2.start.vo.ResultData;

/**
 * @Description: 组装数据
 * @Author: xiongyongjie
 * @Date: 2018/6/18 8:40
 * @Version: v1.0
 **/
public class ResultUtils {


    /**
     * 结果返回
     * @param object
     * @return
     */
    public static ResultData getDataResult(Object object) {
        return new ResultData(DataEnum.DATA_SUCCESS.getCode(),DataEnum.DATA_SUCCESS.getMsg(),object);
    }

    public static ResultData getDataResult(int code, Object object) {
        return new ResultData(code,"处理成功",object);
    }

    public static ResultData getDataResult(int code,String msg,Object object) {
        return new ResultData(code,msg,object);
    }

}
