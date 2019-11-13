package com.qcloud.design.factorymethod;

import android.util.Log;

/**
 * Description: 极光推送处理消息 ---> 具体产品
 * Author: gaobaiqiang
 * 2019-11-08 15:57.
 */
public class JiguangPush implements PushChannel {

    @Override
    public void push(String message) {
        Log.e("PUSH", "极光推送收到消息: " + message);
    }

    @Override
    public void setAlias(String alias) {
        Log.e("PUSH", "极光设置别名: " + alias);
    }
}
