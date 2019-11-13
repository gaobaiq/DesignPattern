package com.qcloud.design.builder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 生成器模式 ---> 将一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表示。
 *      何时使用:
 *      当系统准备为用户提供一个内部结构复杂的对象，而且在构造方法中编写创建该对象的代码无法满足用户需求时，就可以使用生成器模式老构造这样的对象。
 *      当某些系统要求对象的构造过程必须独立于创建该对象的类时。
 *      优点:
 *      生成器模式将对象的构造过程封装在具体的生成器中，用户使用不同的具体生成器就可以得到该对象的不同表示。
 *      生成器模式将对象的构造过程从创建该对象的类中分离出来，使用户无须了解该对象的具体组件。
 *      可以更加精细有效的控制对象的构造过程。生成器将对象的构造过程分解成若干步骤，这就是程序可以更加精细，有效的控制整个对象的构造。
 *      生成器模式将对象的构造过程与创建该对象类解耦，是对象的创建更加灵活有弹性。
 *      当增加新的具体的生成器是，不必修改指挥者的代码，即该模式满足开-闭原则。
 * Author: gaobaiqiang
 * 2019-11-13 11:52.
 */
public class BuilderActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;

    private IProductBuilder mBuilder;
    private ProductDerector mDerector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        mTvLog = findViewById(R.id.tv_log);

        findViewById(R.id.btn_builder1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mBuilder = new ProductBuilder1(new ProductBean()).buildDate("2019", "11", "12");
//                mTvLog.setText(mBuilder.getBirthday());

                mDerector = new ProductDerector(new ProductBuilder1(new ProductBean()));
                mTvLog.setText(mDerector.getProductBirthday("2019", "11", "12"));
            }
        });

        findViewById(R.id.btn_builder2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBuilder = new ProductBuilder2(new ProductBean()).buildDate("2019", "11", "12");
                mTvLog.setText(mBuilder.getBirthday());
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, BuilderActivity.class));
    }
}
