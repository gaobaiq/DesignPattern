package com.qcloud.design.observer;

/**
 * Description: 天气服务的接口（主题）
 * Author: gaobaiqiang
 * 2019-11-14 16:24.
 */
public interface IWeatherService {
    /**添加观察者*/
    void addClient(Client client);

    /**删除观察者*/
    boolean deleteClient(Client client);

    /**通知*/
    void notifyClients();

    /**主题内容更新*/
    void updateWeather(WeatherInfo info);
}
