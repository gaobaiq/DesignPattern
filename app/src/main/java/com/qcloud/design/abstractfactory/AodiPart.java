package com.qcloud.design.abstractfactory;

import android.util.Log;

/**
 * Description: 奥迪配件
 * Author: gaobaiqiang
 * 2019-11-12 16:24.
 */
public class AodiPart implements PartsProduct {

    @Override
    public void createWheel() {
        Log.e("CAR", "奥迪车轮");
    }
}
