package com.qcloud.design.builder;

/**
 * Description: 抽象生成器
 * Author: gaobaiqiang
 * 2019-11-13 14:01.
 */
public interface IProductBuilder {

    IProductBuilder buildDate(String year, String month, String day);

    String getBirthday();

    String getYearMonth();
}
