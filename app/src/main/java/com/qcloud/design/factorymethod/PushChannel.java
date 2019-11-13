package com.qcloud.design.factorymethod;

/**
 * Description: 抽象推送渠道 ---> 具体构造者
 * Author: gaobaiqiang
 * 2019-11-08 15:45.
 */
public interface PushChannel {
    void push(String message);

    void setAlias(String alias);
}
