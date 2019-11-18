package com.qcloud.design.bridge;

import android.util.Log;

/**
 * Description: 细化抽象
 * Author: gaobaiqiang
 * 2019-11-18 10:09.
 */
public class NetSave extends AbstractSave {
    public NetSave(ISaveData saveData) {
        super(saveData);
    }
    @Override
    public void save(Object data) {
        Log.e("BRIDGE", "网络存储：");
        saveData.save(data);
    }
}
