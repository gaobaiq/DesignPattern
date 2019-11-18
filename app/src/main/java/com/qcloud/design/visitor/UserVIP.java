package com.qcloud.design.visitor;

/**
 * Description: VIP用户，具体元素
 * Author: gaobaiqiang
 * 2019-11-15 14:32.
 */
public class UserVIP implements User {
    String estimation;

    public UserVIP(String estimation){
        this.estimation = estimation;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String getEstimation(){
        return estimation;
    }
}
