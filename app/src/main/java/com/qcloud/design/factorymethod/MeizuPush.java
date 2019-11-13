package com.qcloud.design.factorymethod;

import android.util.Log;

/**
 * Description: 魅族推送处理消息 ---> 具体产品
 * Author: gaobaiqiang
 * 2019-11-08 15:48.
 */
public class MeizuPush implements PushChannel {

    @Override
    public void push(String message) {
        Log.e("PUSH", "魅族推送收到消息: " + message);
    }

    @Override
    public void setAlias(String alias) {
        Log.e("PUSH", "魅族设置别名: " + alias);
    }
}
