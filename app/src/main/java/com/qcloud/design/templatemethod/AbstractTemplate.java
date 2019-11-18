package com.qcloud.design.templatemethod;

import android.util.Log;

/**
 * Description: 抽象模板
 * Author: gaobaiqiang
 * 2019-11-15 11:28.
 */
public abstract class AbstractTemplate {
    Object data;

    /**
     * 这个就是模板方法
     * */
    void dealData() {
        getData();

        calcData();

        printData();
    }

    // 下面是普通方法，可能已经实现，也可能需要子类实现
    abstract void getData();

    abstract void calcData();

    private void printData() {
        Log.e("TEMPLATE", "数据: " + data);
    }
}
