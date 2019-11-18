package com.qcloud.design.visitor;

import android.util.Log;

/**
 * Description: 具体访问者
 * Author: gaobaiqiang
 * 2019-11-15 14:33.
 */
public class APPOwner implements Visitor {
    @Override
    public void visit(UserVIP user) {
        String estimation = user.getEstimation();
        if (estimation.length() > 5) {
            Log.e("VISITOR", "记录一条有效反馈：" + estimation);
        }
    }

    @Override
    public void visit(UserOrdinary user) {
        String estimation = user.getEstimation();
        if (estimation.length() > 10) {
            Log.e("VISITOR", "记录一条有效反馈：" + estimation);
        }
    }
}
