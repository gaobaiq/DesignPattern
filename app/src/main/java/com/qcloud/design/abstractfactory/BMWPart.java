package com.qcloud.design.abstractfactory;

import android.util.Log;

/**
 * Description: 宝马配件
 * Author: gaobaiqiang
 * 2019-11-12 16:30.
 */
public class BMWPart implements PartsProduct {
    @Override
    public void createWheel() {
        Log.e("CAR", "宝马车轮");
    }
}
