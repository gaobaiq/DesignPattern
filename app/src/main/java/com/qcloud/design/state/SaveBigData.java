package com.qcloud.design.state;

import android.util.Log;

/**
 * Description: 具体状态(大数据)
 * Author: gaobaiqiang
 * 2019-11-14 17:50.
 */
public enum SaveBigData implements ISaveData {
    getInstance();

    @Override
    public void save(Object data) {
        Log.e("STATE", "保存到文件:" + data);
    }
}
