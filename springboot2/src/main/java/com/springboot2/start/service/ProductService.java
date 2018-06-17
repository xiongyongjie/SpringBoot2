package com.springboot2.start.service;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:34
 * @Version: v1.0
 **/
public interface ProductService {
    /**
     * 查找商品名称
     * @param productCode
     * @return
     */
    String getProductNameByProductCode(String productCode);
}
