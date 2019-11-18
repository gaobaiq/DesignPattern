package com.qcloud.design.adapter;

import android.util.Log;

/**
 * Description: 被适配者（原来的播放器）
 * Author: gaobaiqiang
 * 2019-11-15 14:46.
 */
public class Adaptee {

    void playMp3(Object src) {
        Log.e("ADAPTER", "播放MP3：" + src);
    }
}
