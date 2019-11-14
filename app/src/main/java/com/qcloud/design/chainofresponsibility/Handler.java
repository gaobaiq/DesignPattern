package com.qcloud.design.chainofresponsibility;

/**
 * Description: 处理者
 * Author: gaobaiqiang
 * 2019-11-14 10:09.
 */
public interface Handler {

    /**处理请求*/
    int handleRequest(int n);

    /**设置下一个请求*/
    void setNextHandler(Handler next);
}
