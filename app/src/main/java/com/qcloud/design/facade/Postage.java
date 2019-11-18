package com.qcloud.design.facade;

/**
 * Description: 快递费(子系统)
 * Author: gaobaiqiang
 * 2019-11-18 09:43.
 */
public class Postage {
    int getPostage(String addr) {
        return Math.abs(addr.hashCode()) % 20 + 6;//模拟邮费计算
    }
}
