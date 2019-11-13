package com.qcloud.design.abstractfactory;

/**
 * Description: 抽象的汽车工厂 ---> 抽象产品
 *      抽象产品 (AbstractProduct) 可能是一个或多个，从而构成一个或多个产品族
 * Author: gaobaiqiang
 * 2019-11-12 15:57.
 */
public interface ICarFactory {
    /**生产汽车*/
    CarProduct createCar();

    /**生产配件*/
    PartsProduct createPart();
}
