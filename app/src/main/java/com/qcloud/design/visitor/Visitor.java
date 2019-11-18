package com.qcloud.design.visitor;

/**
 * Description: 抽象访问者
 * Author: gaobaiqiang
 * 2019-11-15 14:30.
 */
public interface Visitor {
    void visit(UserVIP user);

    void visit(UserOrdinary user);
}
