package com.springboot2.start.vo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 用户校验注解
 * @Author: xiongyongjie
 * @Date: 2018/6/17 16:19
 * @Version: v1.0
 **/
@Target({ElementType.METHOD,ElementType.FIELD})  //注解作用域
@Retention(RetentionPolicy.RUNTIME)  //注解作用时间
@Constraint(validatedBy = UserValidatorImpl.class) //执行校验逻辑的类
public @interface  UserValidator {

    //校验不过时候的信息
    String message() default "用户信息无效";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
