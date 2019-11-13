package com.qcloud.design.factorymethod;

/**
 * Description: 抽象的推送工厂 ---> 抽象产品
 * Author: gaobaiqiang
 * 2019-11-08 15:51.
 */
public interface IPushFactory {
    // 由子类实现具体是哪个推送
    PushChannel create();

    // 设置别名
    void setAlias(String alias);
}
