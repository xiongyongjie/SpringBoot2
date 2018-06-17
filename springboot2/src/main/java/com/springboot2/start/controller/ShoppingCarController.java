package com.springboot2.start.controller;

import com.springboot2.start.service.MemberService;
import com.springboot2.start.service.MsgSender;
import com.springboot2.start.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 购物车controller
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:45
 * @Version: v1.0
 **/
@RestController
@RequestMapping("shopingcar/order")
public class ShoppingCarController {

    @Autowired
    private ShoppingCarService shoppingCarService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private MsgSender msgSender;

    @PostMapping("create/{productCode}")
    public String createOrder(@PathVariable String productCode) {
        return  shoppingCarService.createOrder(productCode);
    }

    @GetMapping("get/{userId}")
    public String getCurrentUserName(@PathVariable String userId) {
        return memberService.getUserNameById(userId);
    }

    @PostMapping("sendMsg")
    public void sendMSgInfo(String msg) {
        msgSender.sendMsg(msg);
    }



}
