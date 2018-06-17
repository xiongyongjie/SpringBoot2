package com.springboot2.start.service.impl;

import com.springboot2.start.service.MsgSender;

/**
 * @Description: webchat 发送消息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 22:26
 * @Version: v1.0
 **/
public class MsgSenderWebchat implements MsgSender {
    @Override
    public void sendMsg(String msg) {

        System.out.println(String.format("WebChat send msg:%s", msg));
    }
}
