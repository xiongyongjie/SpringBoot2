package com.springboot2.start.vo;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Description:  订单Vo
 * @Author: xiongyongjie
 * @Date: 2018/6/17 14:54
 * @Version: v1.0
 **/
@Data
public class OrderVo {


    /**
     *订单的基础信息
     */

    @UserValidator
    private String user;

    @NotNull(message = "商品名称不能为空")
    private String productName;

    @Min(value = 1,message = "购买数量至少为1个")
    @Max(value = 100,message = "购买数量最大为100个")
    private Integer num;

    @DecimalMin(value = "0.01",message = "金额最少为0.01元")
    private Double amount;

    @Override
    public String toString() {
        return "OrderVo{" +
                "productName='" + productName + '\'' +
                ", num=" + num +
                ", amount=" + amount +
                '}';
    }

}
