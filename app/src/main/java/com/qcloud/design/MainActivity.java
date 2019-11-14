package com.qcloud.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.qcloud.design.abstractfactory.AbstractFactoryActivity;
import com.qcloud.design.builder.BuilderActivity;
import com.qcloud.design.chainofresponsibility.ChainOfResponsibilityActivity;
import com.qcloud.design.command.CommandActivity;
import com.qcloud.design.factorymethod.FactoryMethodActivity;
import com.qcloud.design.interpreter.InterpreterActivity;
import com.qcloud.design.iterator.IteratorActivity;
import com.qcloud.design.prototype.PrototypeActivity;
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

        // 生成器模式
        findViewById(R.id.btn_builder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuilderActivity.openActivity(MainActivity.this);
            }
        });

        // 原型模式
        findViewById(R.id.btn_prototype).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrototypeActivity.openActivity(MainActivity.this);
            }
        });

        // 责任链模式
        findViewById(R.id.btn_chain_of_responsibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChainOfResponsibilityActivity.openActivity(MainActivity.this);
            }
        });

        // 命令模式
        findViewById(R.id.btn_command).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandActivity.openActivity(MainActivity.this);
            }
        });

        // 解释器模式
        findViewById(R.id.btn_interpreter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InterpreterActivity.openActivity(MainActivity.this);
            }
        });

        // 迭代器模式
        findViewById(R.id.btn_iterator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IteratorActivity.openActivity(MainActivity.this);
            }
        });
    }
}
