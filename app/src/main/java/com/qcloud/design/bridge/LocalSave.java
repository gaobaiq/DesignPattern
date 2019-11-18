package com.qcloud.design.bridge;

import android.util.Log;

/**
 * Description: 细化抽象
 * Author: gaobaiqiang
 * 2019-11-18 10:07.
 */
public class LocalSave extends AbstractSave {

    public LocalSave(ISaveData saveData) {
        super(saveData);
    }

    @Override
    public void save(Object data) {
        Log.e("BRIDGE", "本地存储：" );
        saveData.save(data);
    }
}
