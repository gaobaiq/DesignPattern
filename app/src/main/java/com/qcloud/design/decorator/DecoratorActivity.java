package com.qcloud.design.decorator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 装饰模式 ---> 动态的给对象添加额外的职责。就功能来说，装饰模式比生产子类更为灵活。
 *      何时使用:
 *      程序希望动态的增强类的某对对象的功能，而不影响其他对象时
 *      采用继承来增强对象功能不利于系统的扩展和维护时
 *      优点:
 *      被装饰者和装饰者是松耦合关系。
 *      满足开-闭原则
 *      可以使用多个具体装饰器装饰具体组件的实例
 *      说明:
 *      装饰模式使用被装饰类的一个子类的实例，把客户端的调用委派到被装饰类，装饰模式的关键在于这种扩展是完全透明的。
 *          装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为。
 * Author: gaobaiqiang
 * 2019-11-18 10:23.
 */
public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);

        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 被装饰者
                final String data = "数据";
                IPersistentUtil iPersistentUtil = new PersistentUtil();
                iPersistentUtil.persistentMsg(data);
                Log.e("DECORATOR", "下面装饰数据库持久化：");
                iPersistentUtil = new PersistentDbDecorator(iPersistentUtil);
                iPersistentUtil.persistentMsg(data);
                Log.e("DECORATOR", "下面继续装饰网络存储器持久化：");
                iPersistentUtil = new PersistentNetDecorator(iPersistentUtil);
                iPersistentUtil.persistentMsg(data);
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, DecoratorActivity.class));
    }
}
