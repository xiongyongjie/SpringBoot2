package com.springboot2.start.configuration;

import com.springboot2.start.condition.MsgSenderConditionQQ;
import com.springboot2.start.condition.MsgSenderConditionWebchat;
import com.springboot2.start.service.MsgSender;
import com.springboot2.start.service.PriceService;
import com.springboot2.start.service.ProductService;
import com.springboot2.start.service.ShoppingCarService;
import com.springboot2.start.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
/**
 *@Description: bean的声明类
 *@Author: xiongyongjie
 *@Date: 2018/6/11 21:19
 *@Version: v1.0
 **/
@Configuration
public class ServicePriceConfiguration {


    /**
     * 显式指定bean的名称,初始化调用方法即销毁调用方法
     * @return
     */
    @Bean(name = "priceBean",initMethod = "init",destroyMethod = "destroy")
    PriceService initPriceBean() {
        return new PriceServiceImpl();
    }

    /**
     * 初始化productbean
     * @return
     */
    @Bean
    ProductService initProductBean() {
        return new ProductServiceImpl();
    }

    /**
     * 初始化shoppingcar bean
     * @return
     */
    @Bean
    ShoppingCarService initCarBean() {
        return new ShoppingCarServiceImpl();
    }

    /**
     * 条件bean
     * @return
     */
    @Bean
    @Conditional(MsgSenderConditionQQ.class)
    MsgSender  initMsgSenderQQ() {
        System.out.println("QQ msg sender init");
        return new MsgSenderQQ();
    }

    /**
     * 条件bena
     * @return
     */
    @Bean
    @Conditional(MsgSenderConditionWebchat.class)
    MsgSender  initMsgSenderWebchat() {
        System.out.println("webchat msg sender init");
        return new MsgSenderWebchat();
    }


}
