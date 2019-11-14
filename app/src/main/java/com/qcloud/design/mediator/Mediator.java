package com.qcloud.design.mediator;

/**
 * Description: 具体中介者
 * Author: gaobaiqiang
 * 2019-11-14 15:17.
 */
public class Mediator {
    PersistentDB persistentDB;  // 此处可以使用List来存放所有的同事
    PersistentFile persistentFile;

    public Mediator setPersistentDB(PersistentDB persistentDB) {
        this.persistentDB = persistentDB;
        return this;
    }

    public Mediator setPersistentFile(PersistentFile persistentFile) {
        this.persistentFile = persistentFile;
        return this;
    }

    public void notifyOther(IPersistent persistent,Object data) {
        //如果同事都放在List中，此处遍历即可
        if (persistent instanceof PersistentDB) {
            persistentFile.getData(data);
        } else if (persistent instanceof PersistentFile) {
            persistentDB.getData(data);
        }
    }
}
