package com.qcloud.design.plyweight;

import java.util.HashMap;

/**
 * Description: 享元工厂
 * Author: gaobaiqiang
 * 2019-11-18 09:22.
 */
public class WeatherFactory {
    private HashMap<IWeather, IWeather> weathers;

    public WeatherFactory(){
        weathers = new HashMap<>();
    }

    public IWeather getFlyWeight(String weather, int temperature) {
        Weather objectWeather = new Weather(weather, temperature);
        IWeather flyweight = weathers.get(objectWeather);
        if (flyweight == null) {
            flyweight = objectWeather;
            weathers.put(objectWeather, flyweight);
        } else {
            objectWeather = null;//方便gc回收
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return weathers.size();
    }
}
