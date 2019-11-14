package com.qcloud.design.command;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Description: 接收者
 * Author: gaobaiqiang
 * 2019-11-14 11:28.
 */
public class Printer {
    private static ConcurrentLinkedDeque<String> mPrintDeque;

    public Printer() {
        mPrintDeque = new ConcurrentLinkedDeque<>();
    }

    /**
     * 添加打印内容
     * */
    public String addContent(String content) {
        if (mPrintDeque == null) {
            mPrintDeque = new ConcurrentLinkedDeque<>();
        }
        mPrintDeque.add(content);
        return content;
    }

    /**
     * 拿出打印内容
     * */
    public String pollContent(String content) {
        if (mPrintDeque != null && !mPrintDeque.isEmpty()) {
            return mPrintDeque.poll();
        } else {
            return null;
        }
    }
}
