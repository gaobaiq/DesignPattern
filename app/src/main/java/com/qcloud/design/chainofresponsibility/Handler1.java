package com.qcloud.design.chainofresponsibility;

import android.util.Log;

/**
 * Description: 具体的处理者，处理小于0的
 * Author: gaobaiqiang
 * 2019-11-14 10:25.
 */
public class Handler1 implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        if (n < 0) {
            Log.e("CHAIN", "Handler1处理了");
            return -n;
        } else {
            if (next == null) {
                throw new NullPointerException("next 不能为空");
            }
            return next.handleRequest(n);
        }
    }

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
