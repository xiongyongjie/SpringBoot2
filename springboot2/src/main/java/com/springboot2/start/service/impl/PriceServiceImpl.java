package com.springboot2.start.service.impl;
import com.springboot2.start.service.*;
/**
 *@Description: 价格service类
 *@Author: xiongyongjie
 *@Date: 2018/6/11 21:11
 *@Version: v1.0
 **/
public class PriceServiceImpl implements  PriceService{

    public void init(){
        System.out.println("bean init start...");
    }

    @Override
    public Double getPriceByProductCode(String productCode) {
        //TODO
        return new Double(1.2);
    }

    public void destroy(){
        System.out.println("bean destory...");
    }
}
