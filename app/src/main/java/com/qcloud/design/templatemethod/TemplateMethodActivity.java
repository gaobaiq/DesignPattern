package com.qcloud.design.templatemethod;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 模板方法模式 ---> 定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *      何时使用:
 *      设计者需要给出一个算法的固定步骤，并将某些步骤的具体实现留给子类来实现。
 *      需要对代码进行重构，将各个子类公共行为提取出来集中到一个共同的父类中以避免代码重复。
 *      优点:
 *      可以通过在抽象模板能定义模板方法给出成熟的算法步骤，同时又不限制步骤的细节，具体模板实现算法细节不会改变整个算法的骨架。
 *      在抽象模板模式中，可以通过钩子方法对某些步骤进行挂钩，具体模板通过钩子可以选择算法骨架中的某些步骤。
 *      说明:
 *      模板方法也比较简单，但是非常常用，如Android中Activity中生命周期的一些方法，都会被按序调用，也用到了这种设计模式。
 *          同样的，我们通常会使用一些封装好的http请求库，里面的实现要我们自己写，但是逻辑都已经规定好了，不也是模板方法模式么。
 *          总之，模板方法模式使用是非常广泛的。
 * Author: gaobaiqiang
 * 2019-11-15 11:20.
 */
public class TemplateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);
        findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Template template = new Template();
                template.dealData();
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, TemplateMethodActivity.class));
    }
}
