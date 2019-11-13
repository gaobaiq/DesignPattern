package com.qcloud.design.abstractfactory;

/**
 * Description: 推送工厂实现子类 ---> 构造者
 * Author: gaobaiqiang
 * 2019-11-12 16:39.
 */
public class AodiFactory implements ICarFactory {

    @Override
    public CarProduct createCar() {
        return new AodiCar();
    }

    @Override
    public PartsProduct createPart() {
        return new AodiPart();
    }
}
