package com.springboot2.start.controller;

import com.springboot2.start.exception.BisException;
import com.springboot2.start.exception.DataEnum;
import com.springboot2.start.util.ResultUtils;
import com.springboot2.start.vo.OrderVo;
import com.springboot2.start.vo.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Description: 订单
 * @Author: xiongyongjie
 * @Date: 2018/6/17 14:11
 * @Version: v1.0
 **/
@RestController
@RequestMapping("api/order")
@Slf4j
public class OrderController {

    @GetMapping("get/{userId}/{orderId}")
    public String getMethod(@PathVariable(name = "userId") String userId,@PathVariable(name = "orderId") String orderId) {

        log.info("{} get method orderid is {}",userId,orderId);
        return "get";
    }

    @PostMapping("post")
    public String postMethod(HttpServletRequest request, HttpServletResponse response) {
        log.info("post:"+request.getParameter("name"));
        return "post";
    }

    @PostMapping("submitJsonData")
    public String postJsonDataMethod(@RequestBody @Valid  OrderVo orderVo,BindingResult bindingResult ) {
        //参数校验
        if(bindingResult.hasErrors()){
            return  bindingResult.getFieldErrors().get(0).getDefaultMessage();
        }
        //进行参数校验
//        if (null != orderVo) {
//            if (StringUtils.isEmpty(orderVo.getProductName())) {
//                return "商品名称不为空!";
//            } else if (StringUtils.isEmpty(orderVo.getNum())) {
//                return "购买数量不能为空!";
//            }
//        }
        log.info("post:"+orderVo.toString());
        return "post";
    }

    @PostMapping("submitData")
    @ResponseBody
    public ResultData postDataMethod(@RequestBody @Valid  OrderVo orderVo, BindingResult bindingResult ) {
        //参数校验
        if(bindingResult.hasErrors()){
            throw new BisException(DataEnum.DATA_ERROR.getCode(),bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }
        log.info("post:"+orderVo.toString());
        return ResultUtils.getDataResult(orderVo);
    }

//    /**
//     * 统一异常处理
//     * @param ex
//     * @return
//     */
//    @ExceptionHandler({BisException.class})
//    public ResultData exception(BisException ex){
//        return ResultUtils.getDataResult(ex.getCode(),ex.getMessage(),null);
//    }


    @PostMapping("getHeadData")
    public String getHeadDataMethod(@RequestHeader("MyHead") String MyHead,
                                    @CookieValue(name = "ckName",required=false) String ckName ) {
        log.info("MyHead:"+MyHead);
        log.info("ckName:"+ckName);
        return "post";
    }

    @PutMapping("put")
    public String putMehtod() {
        log.info("put");
        return "put";
    }

    @DeleteMapping("delete")
    public String deleteMethod() {
        log.info("delete");
        return "delete";
    }



}
