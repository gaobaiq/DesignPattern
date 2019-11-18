package com.qcloud.design.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 适配器模式 ---> 将一个类的接口转换成客户希望的另外一个接口。该模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *      何时使用:
 *      一个程序想使用已经存在的类，但是该类所实现的接口和当前程序所使用的接口不一致时。
 *      优点:
 *      目标与被适配者解耦
 *      满足开-闭原则
 *      说明:
 *      原理就是保留现有的类所提供的服务，修改其接口，从而达到客户端的期望。
 * Author: gaobaiqiang
 * 2019-11-15 14:42.
 */
public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Adaptee adaptee = new Adaptee();
                adaptee.playMp3("mp3");

                Target target = new ClassAdapter();
                target.playFlac("flac");

                target = new ObjectAdapter();
                target.playFlac("flac");
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, AdapterActivity.class));
    }
}
