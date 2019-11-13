package com.qcloud.design.factorymethod;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 工厂方法模式 ---> 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
 *      何时使用：
 *      用户需要一个类的子类的实例，但不希望与该类的子类形成耦合
 *      用户需要一个类的子类的实例，但用户不知道该类有哪些子类可用
 *      优点：
 *      使用工厂方法可以让用户的代码和某个特定类的子类的代码解耦
 *      工厂方法使用户不必知道它所使用的对象是怎样被创建的，只需知道该对象有哪些方法即可
 *      流程：
 *      抽象产品(IPushFactory) ---> 构造者(PushFactory) ---> 具体构造者(PushChannel) ---> 具体产品(Huawei、Meizu、Xiaomi)
 *      备注：
 *      一抽象产品类派生出多个具体产品类；
 *      一抽象工厂类派生出多个具体工厂类；
 *      每个具体工厂类只能创建一个具体产品类的实例。
 *      即定义一个创建对象的接口（即抽象工厂类），让其子类（具体工厂类）决定实例化哪一个类（具体产品类）。“一对一”的关系
 * Author: gaobaiqiang
 * 2019-11-08 14:54.
 */
public class FactoryMethodActivity extends AppCompatActivity {
    private IPushFactory mPush;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        mPush = new PushFactory();

        findViewById(R.id.btn_set_alias).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPush.create().setAlias("3a252e05d72f1480aa7f02e7d21433ffe");
            }
        });

        findViewById(R.id.btn_push).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPush.create().push("您收到一个通知");
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, FactoryMethodActivity.class));
    }
}
