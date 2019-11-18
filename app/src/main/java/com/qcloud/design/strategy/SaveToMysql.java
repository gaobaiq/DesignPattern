package com.qcloud.design.strategy;

import android.util.Log;

/**
 * Description: 具体策略
 * Author: gaobaiqiang
 * 2019-11-15 11:10.
 */
public class SaveToMysql implements ISaveData {
    @Override
    public void save(Object data) {
        Log.e("STRATEGY", "数据：" + data + " 保存到Mysql");
    }
}
