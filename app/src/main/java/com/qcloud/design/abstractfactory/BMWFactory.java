package com.qcloud.design.abstractfactory;

/**
 * Description: 推送工厂实现子类 ---> 构造者
 * Author: gaobaiqiang
 * 2019-11-12 16:41.
 */
public class BMWFactory implements ICarFactory {

    @Override
    public CarProduct createCar() {
        return new BMWCar();
    }

    @Override
    public PartsProduct createPart() {
        return new BMWPart();
    }
}
