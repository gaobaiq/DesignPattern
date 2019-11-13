package com.qcloud.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.qcloud.design.abstractfactory.AbstractFactoryActivity;
import com.qcloud.design.factorymethod.FactoryMethodActivity;
import com.qcloud.design.singleton.SingletonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 单例模式
        findViewById(R.id.btn_single).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SingletonActivity.openActivity(MainActivity.this);
            }
        });

        // 工厂方法模式
        findViewById(R.id.btn_factory_method).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactoryMethodActivity.openActivity(MainActivity.this);
            }
        });

        // 抽像工厂模式
        findViewById(R.id.btn_abstract_factory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbstractFactoryActivity.openActivity(MainActivity.this);
            }
        });
    }
}