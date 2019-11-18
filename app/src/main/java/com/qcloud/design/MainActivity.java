package com.qcloud.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.qcloud.design.abstractfactory.AbstractFactoryActivity;
import com.qcloud.design.adapter.AdapterActivity;
import com.qcloud.design.bridge.BridgeActivity;
import com.qcloud.design.builder.BuilderActivity;
import com.qcloud.design.chainofresponsibility.ChainOfResponsibilityActivity;
import com.qcloud.design.command.CommandActivity;
import com.qcloud.design.decorator.DecoratorActivity;
import com.qcloud.design.facade.FacadeActivity;
import com.qcloud.design.factorymethod.FactoryMethodActivity;
import com.qcloud.design.interpreter.InterpreterActivity;
import com.qcloud.design.iterator.IteratorActivity;
import com.qcloud.design.mediator.MediatorActivity;
import com.qcloud.design.memento.MementoActivity;
import com.qcloud.design.observer.ObserverActivity;
import com.qcloud.design.plyweight.PlyweightActivity;
import com.qcloud.design.prototype.PrototypeActivity;
import com.qcloud.design.proxy.ProxyActivity;
import com.qcloud.design.singleton.SingletonActivity;
import com.qcloud.design.state.StateActivity;
import com.qcloud.design.strategy.StrategyActivity;
import com.qcloud.design.templatemethod.TemplateMethodActivity;
import com.qcloud.design.visitor.VisitorActivity;

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

        // 中介模式
        findViewById(R.id.btn_mediator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediatorActivity.openActivity(MainActivity.this);
            }
        });

        // 备忘录模式
        findViewById(R.id.btn_memento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MementoActivity.openActivity(MainActivity.this);
            }
        });

        // 观察者模式
        findViewById(R.id.btn_observer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObserverActivity.openActivity(MainActivity.this);
            }
        });

        // 状态模式
        findViewById(R.id.btn_state).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StateActivity.openActivity(MainActivity.this);
            }
        });

        // 策略模式
        findViewById(R.id.btn_strategy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyActivity.openActivity(MainActivity.this);
            }
        });

        // 模板方法模式
        findViewById(R.id.btn_template_method).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemplateMethodActivity.openActivity(MainActivity.this);
            }
        });

        // 访问者模式
        findViewById(R.id.btn_visitor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisitorActivity.openActivity(MainActivity.this);
            }
        });

        // 适配器模式
        findViewById(R.id.btn_adapter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdapterActivity.openActivity(MainActivity.this);
            }
        });

        // 代理模式
        findViewById(R.id.btn_proxy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProxyActivity.openActivity(MainActivity.this);
            }
        });

        // 享元模式
        findViewById(R.id.btn_plywieght).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlyweightActivity.openActivity(MainActivity.this);
            }
        });

        // 外观模式
        findViewById(R.id.btn_facade).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FacadeActivity.openActivity(MainActivity.this);
            }
        });

        // 桥接模式
        findViewById(R.id.btn_bridge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BridgeActivity.openActivity(MainActivity.this);
            }
        });

        // 装饰模式
        findViewById(R.id.btn_decorator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecoratorActivity.openActivity(MainActivity.this);
            }
        });
    }
}
