package com.springboot2.start.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:  统一异常处理
 * @Author: xiongyongjie
 * @Date: 2018/6/18 9:31
 * @Version: v1.0
 **/
//@Component
@Slf4j
public class BizHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        /*  使用response返回    */
        response.setStatus(HttpStatus.OK.value());
        //设置ContentType
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        try {
            response.getWriter().write("{\"code\":-1,\"msg\":\"" + ex.getMessage() + "\"}");
        } catch (IOException e) {
            log.error("统一异常处理失败", e);
        }

        log.debug("异常:" + ex.getMessage(), ex);
        return mv;
    }

}
