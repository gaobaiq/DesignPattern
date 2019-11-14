package com.qcloud.design.chainofresponsibility;

import android.util.Log;

/**
 * Description: 具体的处理者，处理大于0和小于10的
 * Author: gaobaiqiang
 * 2019-11-14 10:27.
 */
public class Handler2 implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        if (n < 10) {
            Log.e("CHAIN", "Handler2处理了");
            return n*n;
        } else {
            if(next == null) {
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
