package com.qcloud.design.command;

/**
 * Description: 具体命令 ---> 添加
 * Author: gaobaiqiang
 * 2019-11-14 11:40.
 */
public class AddCommand implements PrintCommand {
    private Printer mPrinter;

    public AddCommand(Printer printer) {
        this.mPrinter = printer;
    }

    @Override
    public String execute(String content) {
        return mPrinter.addContent(content);
    }
}
