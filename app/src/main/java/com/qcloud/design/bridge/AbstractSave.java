package com.qcloud.design.bridge;

/**
 * Description: 抽象
 * Author: gaobaiqiang
 * 2019-11-18 10:06.
 */
public abstract class AbstractSave {
    ISaveData saveData;

    public AbstractSave(ISaveData saveData) {
        this.saveData = saveData;
    }

    public abstract void save(Object data);
}
