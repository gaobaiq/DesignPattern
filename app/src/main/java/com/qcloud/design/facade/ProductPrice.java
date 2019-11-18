package com.qcloud.design.facade;

/**
 * Description: 商品价格(子系统)
 * Author: gaobaiqiang
 * 2019-11-18 09:43.
 */
public class ProductPrice {
    int getPrice(String product) {
        return Math.abs(product.hashCode());//模拟获取商品价格
    }
}
