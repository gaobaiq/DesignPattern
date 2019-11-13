package com.qcloud.design.builder;

/**
 * Description: 具体生成器
 * Author: gaobaiqiang
 * 2019-11-13 14:02.
 */
public class ProductBuilder1 implements IProductBuilder {
    private ProductBean mBean;

    public ProductBuilder1(ProductBean bean) {
        this.mBean = bean;
    }

    @Override
    public IProductBuilder buildDate(String year, String month, String day) {
        mBean.setYearMonth(year + "-" + month);
        mBean.setBirthday(year + "-" + month + "-" + day);
        return this;
    }

    @Override
    public String getBirthday() {
        return mBean.getBirthday();
    }

    @Override
    public String getYearMonth() {
        return mBean.getYearMonth();
    }
}
