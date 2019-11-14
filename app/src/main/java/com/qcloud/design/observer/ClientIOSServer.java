package com.qcloud.design.observer;

import android.util.Log;

/**
 * Description: 具体的客户端（观察者）
 * Author: gaobaiqiang
 * 2019-11-14 16:30.
 */
public class ClientIOSServer implements Client {
    private static String name = "苹果服务";
    private WeatherInfo info;

    @Override
    public void getWeather(WeatherInfo info) {
        this.info = info;
        dealMsg();
    }

    private void dealMsg() {
        Log.e(name, "收到最新天气：time = " + info.getTime() + "msg = " + info.getWeather() + "。马上开始推送消息...");
    }
}
