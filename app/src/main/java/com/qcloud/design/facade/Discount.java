package com.qcloud.design.facade;

/**
 * Description: 优惠(子系统)
 * Author: gaobaiqiang
 * 2019-11-18 09:44.
 */
public class Discount {
    int getDiscount(String discountCode) {
        return Math.abs(discountCode.hashCode()) % 3;
    }
}
