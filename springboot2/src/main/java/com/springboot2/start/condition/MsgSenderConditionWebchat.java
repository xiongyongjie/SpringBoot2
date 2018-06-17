package com.springboot2.start.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 22:27
 * @Version: v1.0
 **/
public class MsgSenderConditionWebchat implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String msg = context.getEnvironment().getProperty("msg.sender");
        return "Webchat".equals(msg);
    }
    
}
