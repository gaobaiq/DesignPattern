package com.qcloud.design.strategy;

/**
 * Description: 环境
 * Author: gaobaiqiang
 * 2019-11-15 11:12.
 */
public class SaveClient {
    private ISaveData saveData;

    public SaveClient(ISaveData saveData){
        this.saveData = saveData;
    }

    public void setSaveData(ISaveData saveData){
        this.saveData = saveData;
    }

    public void save(Object data){
        saveData.save(data);
    }
}
