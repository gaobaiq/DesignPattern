package com.qcloud.design.bridge;

import android.util.Log;

/**
 * Description: 具体实现
 * Author: gaobaiqiang
 * 2019-11-18 10:05.
 */
public class SaveToDB implements ISaveData {

    @Override
    public void save(Object data) {
        Log.e("BRIDGE", data + "保存到数据库");
    }
}
