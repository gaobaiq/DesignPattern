package com.qcloud.design.factorymethod;

import android.util.Log;

/**
 * Description: 小米推送处理消息 ---> 具体产品
 * Author: gaobaiqiang
 * 2019-11-08 15:50.
 */
public class XiaomiPush implements PushChannel {

    @Override
    public void push(String message) {
        Log.e("PUSH", "小米推送收到消息: " + message);
    }

    @Override
    public void setAlias(String alias) {
        Log.e("PUSH", "小米设置别名: " + alias);
    }
}
