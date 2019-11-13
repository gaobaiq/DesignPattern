package com.qcloud.design.builder;

/**
 * Description: 产品指挥官
 * Author: gaobaiqiang
 * 2019-11-13 14:05.
 */
public class ProductDerector {
    private IProductBuilder mBuilder;

    public ProductDerector(IProductBuilder builder) {
        this.mBuilder = builder;
    }

    public String getProductBirthday(String year, String month, String day) {
        mBuilder.buildDate(year, month, day);
        return mBuilder.getBirthday();
    }
}
