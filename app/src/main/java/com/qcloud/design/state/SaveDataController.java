package com.qcloud.design.state;

/**
 * Description: 环境（Context）
 * Author: gaobaiqiang
 * 2019-11-14 17:49.
 */
public class SaveDataController {
    private ISaveData saveData;

    public void save(String data) {
        // 为了演示，此处的大的数据其实也是很小的
        if(data.length()<1<<2) {
            saveData = SaveSmallData.getInstance;
        } else if(data.length()<1<<4) {
            saveData = SaveMiddleData.getInstance;
        } else {
            saveData = SaveBigData.getInstance;
        }
        saveData.save(data);
    }
}
