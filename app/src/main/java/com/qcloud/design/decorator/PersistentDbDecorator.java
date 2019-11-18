package com.qcloud.design.decorator;

import android.util.Log;

/**
 * Description: 装饰--存入数据库
 * Author: gaobaiqiang
 * 2019-11-18 10:33.
 */
public class PersistentDbDecorator extends PersistentDecorator {

    public PersistentDbDecorator(IPersistentUtil iPersistentUtil){
        super(iPersistentUtil);
    }
    @Override
    public void persistentMsg(String msg) {
        iPersistentUtil.persistentMsg(msg);
        persistentToDb(msg);
    }
    private void persistentToDb(String msg) {
        Log.e("DECORATOR", msg + " 存入数据库");
    }
}
