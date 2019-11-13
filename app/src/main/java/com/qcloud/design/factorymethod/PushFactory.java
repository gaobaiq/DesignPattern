package com.qcloud.design.factorymethod;

/**
 * Description: 推送工厂实现子类 ---> 构造者
 * Author: gaobaiqiang
 * 2019-11-08 16:00.
 */
public class PushFactory implements IPushFactory {
    private PushChannel mChannel;

    @Override
    public PushChannel create() {
        if (mChannel == null) {
            if (BrandUtil.isEmui()) {
                // 华为
                mChannel = new HuaweiPush();
            } else if (BrandUtil.isFlyme()) {
                // 魅族
                mChannel = new MeizuPush();
            } else if (BrandUtil.isMiui()) {
                // 小米
                mChannel = new XiaomiPush();
            } else {
                // 极光
                mChannel = new JiguangPush();
            }
        }
        return mChannel;
    }

    @Override
    public void setAlias(String alias) {
        if (mChannel != null) {
            mChannel.setAlias(alias);
        }
    }
}
