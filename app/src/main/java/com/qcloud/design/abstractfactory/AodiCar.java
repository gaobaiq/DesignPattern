package com.qcloud.design.abstractfactory;

import android.util.Log;

/**
 * Description: 奥迪
 * Author: gaobaiqiang
 * 2019-11-12 16:07.
 */
public class AodiCar implements CarProduct {

    @Override
    public void createWhite() {
        Log.e("CAR", "白色奥迪");
    }

    @Override
    public void createBlack() {
        Log.e("CAR", "黑色奥迪");
    }
}
