package com.qcloud.design.command;

/**
 * Description: 具体命令 ---> 拿出
 * Author: gaobaiqiang
 * 2019-11-14 11:42.
 */
public class PollCommand implements PrintCommand {
    private Printer mPrinter;

    public PollCommand(Printer printer) {
        this.mPrinter = printer;
    }

    @Override
    public String execute(String content) {
        return mPrinter.pollContent(content);
    }
}
