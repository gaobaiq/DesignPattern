package com.qcloud.design.mediator;

import android.util.Log;

/**
 * Description: 具体同事 ---> 持久化到数据库
 * Author: gaobaiqiang
 * 2019-11-14 15:19.
 */
public class PersistentDB implements IPersistent {
    private Object data;

    @Override
    public void getData(Object data, Mediator mediator) {
        getData(data);
        mediator.notifyOther(this, data);
    }

    @Override
    public void saveData() {
        Log.e("MEDIATOR", data + " 已保存到数据库");
    }

    @Override
    public void getData(Object data) {
        this.data = data;
        saveData();
    }
}
