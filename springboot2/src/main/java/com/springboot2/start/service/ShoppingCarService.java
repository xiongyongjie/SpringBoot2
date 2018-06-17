package com.springboot2.start.service;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:39
 * @Version: v1.0
 **/
public interface ShoppingCarService {

    /**
     * 创建订单
     * @param productId
     * @return
     */
    String createOrder(String productId);
}
