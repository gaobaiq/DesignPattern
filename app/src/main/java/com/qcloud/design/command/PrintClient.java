package com.qcloud.design.command;

/**
 * Description: 请求者
 * Author: gaobaiqiang
 * 2019-11-14 11:45.
 */
public class PrintClient {
    private PrintCommand mPrintCommand;

    /**
     * 设置命令
     * */
    public PrintClient setCommand(PrintCommand command){
        this.mPrintCommand = command;
        return this;
    }

    /**
     * 执行命令
     * */
    public String executeCommand(String name) throws Exception {
        if(mPrintCommand == null) {
            throw new Exception("命令不能为空！");
        }
        return mPrintCommand.execute(name);
    }
}
