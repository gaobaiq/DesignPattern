package com.qcloud.design.adapter;

/**
 * Description: 类适配器
 * Author: gaobaiqiang
 * 2019-11-15 14:48.
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void playFlac(Object src) {
        //可能需要对src作处理
        playMp3(src);
    }
}
