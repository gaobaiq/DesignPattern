package com.qcloud.design.decorator;

import android.util.Log;

/**
 * Description: 装饰--存入网络其他地方
 * Author: gaobaiqiang
 * 2019-11-18 10:34.
 */
public class PersistentNetDecorator extends PersistentDecorator {
    public PersistentNetDecorator(IPersistentUtil iPersistentUtil){
        super(iPersistentUtil);
    }

    @Override
    public void persistentMsg(String msg) {
        iPersistentUtil.persistentMsg(msg);
        persistentToNet(msg);
    }

    private void persistentToNet(String msg) {
        Log.e("DECORATOR", msg + " 存入网络的其他地方");
    }
}
