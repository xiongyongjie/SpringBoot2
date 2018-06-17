package com.springboot2.start.service;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:16
 * @Version: v1.0
 **/
public interface  PriceService {

    /**
     * 查询商品价格信息
     * @param productCode
     * @return
     */
    Double getPriceByProductCode(String productCode);
}
