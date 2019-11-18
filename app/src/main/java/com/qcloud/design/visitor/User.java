package com.qcloud.design.visitor;

/**
 * Description: 抽象元素
 * Author: gaobaiqiang
 * 2019-11-15 14:30.
 */
public interface User {
    void accept(Visitor visitor);
}
