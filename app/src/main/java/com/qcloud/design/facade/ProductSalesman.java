package com.qcloud.design.facade;

/**
 * Description: 购买接口(外观)
 * Author: gaobaiqiang
 * 2019-11-18 09:46.
 */
public enum ProductSalesman {
    getInstance();

    Stock stock = new Stock();
    FinalPrice finalPrice = new FinalPrice();

    Object buySomething(String product, String addr, String discountCode) {
        if(!stock.hasStock(product)) {
            return "库存不足";
        }
        int price = finalPrice.getFinalPrice(product, addr, discountCode);
        return "订单信息:" + product + "-" + addr + "-"  + discountCode + "-"  + price;
    }
}
