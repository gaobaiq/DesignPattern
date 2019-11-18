package com.qcloud.design.facade;

import java.util.Random;

/**
 * Description: 库存(子系统)
 * Author: gaobaiqiang
 * 2019-11-18 09:45.
 */
public class Stock {
    boolean hasStock(String product) {
        return new Random().nextInt(Math.abs(product.hashCode())) > 0;//模拟是否还有库存
    }
}
