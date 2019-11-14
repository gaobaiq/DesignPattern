package com.qcloud.design.mediator;

/**
 * Description: 同事（数据持久化的接口）
 * Author: gaobaiqiang
 * 2019-11-14 15:16.
 */
public interface IPersistent {
    void getData(Object data);

    void getData(Object data, Mediator mediator);

    void saveData();
}
