package com.qcloud.design.decorator;

/**
 * Description:
 * Author: gaobaiqiang
 * 2019-11-18 10:32.
 */
public abstract class PersistentDecorator implements IPersistentUtil {
    IPersistentUtil iPersistentUtil;

    public PersistentDecorator(IPersistentUtil iPersistentUtil){
        this.iPersistentUtil = iPersistentUtil;
    }

    @Override
    public void persistentMsg(String msg) {
        iPersistentUtil.persistentMsg(msg);
    }
}
