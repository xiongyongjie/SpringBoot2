package com.springboot2.start.service.impl;

import com.springboot2.start.service.PriceService;
import com.springboot2.start.service.ProductService;
import com.springboot2.start.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:40
 * @Version: v1.0
 **/
public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private PriceService priceService;

    @Autowired
    private ProductService productService;

    @Override
    public String createOrder(String productCode) {
        double price = priceService.getPriceByProductCode(productCode);
        String name = productService.getProductNameByProductCode(productCode);
        String res = String.format("Price:%s,name:%s,productCode:%s",price,name,productCode);
        System.out.println(res);
        return  res;
    }
}
