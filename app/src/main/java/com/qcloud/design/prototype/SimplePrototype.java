package com.qcloud.design.prototype;

/**
 * Description: 具体原型
 * Author: gaobaiqiang
 * 2019-11-13 15:32.
 */
public class SimplePrototype implements IPrototype, Cloneable {
    private int number;

    @Override
    public Object cloneSelf() {
        SimplePrototype self = new SimplePrototype();
        self.number = number;
        return self;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
