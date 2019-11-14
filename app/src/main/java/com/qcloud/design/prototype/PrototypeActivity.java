package com.qcloud.design.prototype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 原型模式 ---> 用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象
 *      何时使用:
 *      程序需要从一个对象出发，得到若干个和其状态相同，并可独立变化其状态的对象时。
 *      当对象的创建需要独立于它的构造过程和表示时。
 *      一个类创建实例状态不是很多，那么就可以将这个类的一个实例定义为原型，那么通过该实例复制该原型得到新的实例可能比重新使用类的构造方法创建新实例更方便
 *      优点:
 *      当创建类的新实例的代价更大时，使用原型模式复制一个已有的实例可以提高创建新实例的效率。
 *      可以动态的保存当前对象的状态。在运行时，可以随时使用对象流保存当前对象的一个复制品。
 *      可以在运行时创建新的对象，而无须创建一系列类和集成结构。
 *      可以动态的添加、删除原型的复制品。
 *      说明:
 *      原型模式要求对象实现一个可以“克隆”自身的接口，这样就可以通过复制一个实例对象本身来创建一个新的实例。
 *      这样一来，通过原型实例创建新的对象，就不再需要关心这个实例本身的类型，只要实现了克隆自身的方法，
 *      就可以通过这个方法来获取新的对象，而无须再去通过new来创建。
 * Author: gaobaiqiang
 * 2019-11-13 14:31.
 */
public class PrototypeActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;
    private SimplePrototype mPrototype;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);

        mPrototype = new SimplePrototype();

        mTvLog = findViewById(R.id.tv_log);
        findViewById(R.id.btn_pre_clone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvLog.setText("" + mPrototype.getNumber());
            }
        });

        findViewById(R.id.btn_after_clone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPrototype.setNumber(500);
                SimplePrototype copy = (SimplePrototype) mPrototype.cloneSelf();
                mTvLog.setText("" + copy.getNumber());
            }
        });

        findViewById(R.id.btn_after_clone2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPrototype.setNumber(999);
                SimplePrototype copy = (SimplePrototype) mPrototype.cloneSelf();
                copy.setNumber(998);
                mTvLog.setText("" + mPrototype.getNumber() + "," + copy.getNumber());
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, PrototypeActivity.class));
    }
}
