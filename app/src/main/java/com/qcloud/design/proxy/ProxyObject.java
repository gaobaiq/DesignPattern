package com.qcloud.design.proxy;

import android.util.Log;

/**
 * Description: 代理对象
 * Author: gaobaiqiang
 * 2019-11-15 15:05.
 */
public class ProxyObject implements AbstractObject {
    AbstractObject object = new TargetObject();

    @Override
    public void method1() {
        object.method1();
    }

    @Override
    public int method2() {
        return object.method2();
    }

    @Override
    public void method3() {
        Log.e("PROXY", "调用目标对象前的操作");
        object.method3();
        Log.e("PROXY", "调用目标对象后的操作");
    }
}
