package com.springboot2.start.service.impl;

import com.springboot2.start.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/11 21:58
 * @Version: v1.0
 **/
@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public String getUserNameById(String userId) {
        //TODO
        return userId+":name";
    }

}
