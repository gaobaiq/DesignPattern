package com.qcloud.design.adapter;

/**
 * Description: 对象适配器
 * Author: gaobaiqiang
 * 2019-11-15 14:47.
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(){
        super();
        adaptee = new Adaptee();
    }
    @Override
    public void playFlac(Object src) {
        //可能需要对src作处理
        adaptee.playMp3(src);
    }
}
