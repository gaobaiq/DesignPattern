package com.qcloud.design.observer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 观察者模式 ---> 定义对象间的一种一对多的依赖关系，当一个对象状态发生改变时，所有依赖它的对象都得到通知并被自动更新。
 *      何时使用:
 *      当一个对象的数据更新时，需要通知其他对象，而又不希望和被通知的对象形成紧耦合时
 * Author: gaobaiqiang
 * 2019-11-14 16:15.
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        findViewById(R.id.btn_notify).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建主题
                WeatherService service = WeatherService.getInstance;
                //添加观察者
                service.addClient(new ClientAndroidServer());
                service.addClient(new ClientIOSServer());
                //更新主题
                service.updateWeather(new WeatherInfo(System.currentTimeMillis(), "多云"));
                service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "多云转晴"));
                service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24*2, "晴"));
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, ObserverActivity.class));
    }
}
