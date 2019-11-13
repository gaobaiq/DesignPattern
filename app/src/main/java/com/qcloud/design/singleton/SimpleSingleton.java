package com.qcloud.design.singleton;

/**
 * Description: 简单的单例模式，不能用于多线程
 * Author: gaobaiqiang
 * 2019-11-08 14:17.
 */
public class SimpleSingleton {

    public String getData() {
        return "简单的单例模式，不能用于多线程";
    }

    public static SimpleSingleton getInstance() {
        return SimpleHolder.instance;
    }

    private static class SimpleHolder {
        private static final SimpleSingleton instance = new SimpleSingleton();
    }
}
