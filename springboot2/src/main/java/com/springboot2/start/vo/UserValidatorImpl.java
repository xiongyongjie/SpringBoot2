package com.springboot2.start.vo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Description: 描述信息
 * @Author: xiongyongjie
 * @Date: 2018/6/17 16:23
 * @Version: v1.0
 **/
public class UserValidatorImpl implements ConstraintValidator<UserValidator,Object> {

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        String  user =(String)o;
        if("安安熊".equals(user)){
            return true;
        }
        return false;
    }
}
