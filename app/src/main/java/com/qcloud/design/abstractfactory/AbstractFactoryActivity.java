package com.qcloud.design.abstractfactory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 抽像工厂模式 ---> 提供一个创建一系列或相互依赖对象的接口，而无须指定他们的具体的类
 *      简单工厂模式是由一个具体的类去创建其他类的实例，父类是相同的，父类是具体的。
 *      工厂方法模式是有一个抽象的父类定义公共接口，子类负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成。
 *      抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。它针对的是有多个产品的等级结构。
 *      而工厂方法模式针对的是一个产品的等级结构。
 *
 * Author: gaobaiqiang
 * 2019-11-12 14:44.
 */
public class AbstractFactoryActivity extends AppCompatActivity {
    private ICarFactory mAodi;
    private ICarFactory mBmw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

        findViewById(R.id.btn_aodi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAodi == null) {
                    mAodi = new AodiFactory();
                }
                mAodi.createCar().createWhite();
                mAodi.createCar().createBlack();
                mAodi.createPart().createWheel();
            }
        });

        findViewById(R.id.btn_bmw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBmw == null) {
                    mBmw = new BMWFactory();
                }
                mBmw.createCar().createWhite();
                mBmw.createCar().createBlack();
                mBmw.createPart().createWheel();
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, AbstractFactoryActivity.class));
    }
}
