package com.qcloud.design.templatemethod;

/**
 * Description: 具体模板
 * Author: gaobaiqiang
 * 2019-11-15 11:29.
 */
public class Template extends AbstractTemplate {

    @Override
    void getData() {
        data = "data";
    }

    @Override
    void calcData() {
        data = (String)data + data;
    }
}
