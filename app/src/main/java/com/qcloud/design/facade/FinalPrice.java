package com.qcloud.design.facade;

/**
 * Description: 计费子系统
 * Author: gaobaiqiang
 * 2019-11-18 09:45.
 */
public class FinalPrice {
    ProductPrice productPrice;
    Postage postage;
    Discount discount;

    public FinalPrice() {
        productPrice = new ProductPrice();
        postage = new Postage();
        discount = new Discount();
    }

    int getFinalPrice(String product, String addr, String discountCode){
        return productPrice.getPrice(product) + postage.getPostage(addr) - discount.getDiscount(discountCode);
    }
}
