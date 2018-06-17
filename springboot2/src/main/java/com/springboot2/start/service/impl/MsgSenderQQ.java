package com.springboot2.start.service.impl;

import com.springboot2.start.service.MsgSender;

/**
 * @Description: QQ 发送消息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 22:25
 * @Version: v1.0
 **/
public class MsgSenderQQ implements MsgSender {
    @Override
    public void sendMsg(String msg) {

        System.out.println(String.format("QQ send Msg:%s", msg));
    }
}
