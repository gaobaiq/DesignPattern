package com.qcloud.design.proxy;

import android.util.Log;

/**
 * Description: 具体对象
 * Author: gaobaiqiang
 * 2019-11-15 15:03.
 */
public class TargetObject implements AbstractObject {

    @Override
    public void method1() {
        Log.e("PROXY", "具体对象的方法1");
    }

    @Override
    public int method2() {
        Log.e("PROXY", "具体对象的方法2");
        return 0;
    }

    @Override
    public void method3() {
        Log.e("PROXY", "具体对象的方法3");
    }
}
