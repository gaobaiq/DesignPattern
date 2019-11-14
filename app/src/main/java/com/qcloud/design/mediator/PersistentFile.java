package com.qcloud.design.mediator;

import android.util.Log;

/**
 * Description: 具体同事 ---> 持久化到文件
 * Author: gaobaiqiang
 * 2019-11-14 15:17.
 */
public class PersistentFile implements IPersistent {

    private Object data;

    @Override
    public void getData(Object data, Mediator mediator) {
        getData(data);
        mediator.notifyOther(this, data);
    }

    @Override
    public void saveData() {
        Log.e("MEDIATOR", data + "已保存到文件");
    }

    @Override
    public void getData(Object data) {
        this.data = data;
        saveData();
    }
}
