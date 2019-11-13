package com.qcloud.design.abstractfactory;

import android.util.Log;

/**
 * Description: 宝马
 * Author: gaobaiqiang
 * 2019-11-12 16:27.
 */
public class BMWCar implements CarProduct {

    @Override
    public void createWhite() {
        Log.e("CAR", "白色宝马");
    }

    @Override
    public void createBlack() {
        Log.e("CAR", "黑色宝马");
    }
}
