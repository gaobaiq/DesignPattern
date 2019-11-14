package com.qcloud.design.chainofresponsibility;

import android.util.Log;

/**
 * Description: 具体的处理者，处理大于10的
 * Author: gaobaiqiang
 * 2019-11-14 10:28.
 */
public class Handler3 implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        Log.e("CHAIN", "Handler3处理了");
        return n;
    }

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
