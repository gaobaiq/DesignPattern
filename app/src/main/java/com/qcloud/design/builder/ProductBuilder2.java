package com.qcloud.design.builder;

/**
 * Description: 具体生成器
 * Author: gaobaiqiang
 * 2019-11-13 14:02.
 */
public class ProductBuilder2 implements IProductBuilder {
    private ProductBean mBean;

    public ProductBuilder2(ProductBean bean) {
        this.mBean = bean;
    }

    @Override
    public IProductBuilder buildDate(String year, String month, String day) {
        mBean.setYearMonth(year + "年" + month + "月");
        mBean.setBirthday(year + "年" + month + "月" + day + "日");
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
