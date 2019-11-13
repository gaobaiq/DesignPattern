package com.qcloud.design.singleton;

/**
 * Description: 简枚举实现单例模式，可以用于多线程
 * Author: gaobaiqiang
 * 2019-11-08 14:15.
 */
public enum EnumSingleton {
    getInstance();

    /**
     * 获取数据
     * */
    public String getData() {
        return "简枚举实现单例模式，可以用于多线程";
    }
}
