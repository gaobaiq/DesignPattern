package com.qcloud.design.decorator;

import android.util.Log;

/**
 * Description: 具体的被装饰者
 * Author: gaobaiqiang
 * 2019-11-18 10:30.
 */
public class PersistentUtil implements IPersistentUtil {
    @Override
    public void persistentMsg(String msg) {
        Log.e("DECORATOR", msg + " 存入文件");
    }
}
