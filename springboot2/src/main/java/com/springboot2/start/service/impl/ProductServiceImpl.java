package com.springboot2.start.service.impl;
import com.springboot2.start.service.ProductService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:  商品service
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:35
 * @Version: v1.0
 **/
public class ProductServiceImpl implements ProductService {

    @PostConstruct
    public void init(){
        System.out.println("product bean init");
    }


    @Override
    public String getProductNameByProductCode(String id) {
        //TODO
        return "可乐";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("product bean desory");
    }

}
