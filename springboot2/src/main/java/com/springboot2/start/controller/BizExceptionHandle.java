package com.springboot2.start.controller;

import com.springboot2.start.exception.BisException;
import com.springboot2.start.util.ResultUtils;
import com.springboot2.start.vo.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description: 统一异常处理
 * @Author: xiongyongjie
 * @Date: 2018/6/18 9:49
 * @Version: v1.0
 **/
@ControllerAdvice
@ResponseBody
@Slf4j
public class BizExceptionHandle {


    @ExceptionHandler(BisException.class)
    public ResultData handleHttpMessageNotReadableException(BisException ex) {
         //返回异常处理
        return ResultUtils.getDataResult(ex.getCode(),ex.getMessage(),null);
    }

}
