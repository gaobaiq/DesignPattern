package com.qcloud.design.interpreter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 解释器模式 ---> 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 *      何时使用:
 *      当有一个简单的语言需要解释执行，并且可以将该语言的每一个规则表示为一个类时，就可以使用解释器模式。
 *      优点:
 *      将每一个语法规则表示成一个类，方便与实现简单的语言。
 *      由于使用类表示语法的规则，可以较容易改变或扩展语言的行为。
 *      通过在类结构中加入新的方法，可以在解释的同时增加新的行为。
 *      说明:
 *      解释器模式一般包括四种角色
 *      抽象表达式：该角色为一个接口，负责定义抽象的解释操作。
 *      终结符表达式：实现抽象表达式接口的类。
 *      非终结表达式：也是实现抽象表达式的类。
 *      上下文（Context）：包含解释器之外的一些全局信息。
 *      实现步骤:
 *      解析语句中的动作标记。
 *      将标记规约为动作。
 *      执行动作。
 * Author: gaobaiqiang
 * 2019-11-14 14:09.
 */
public class InterpreterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter);
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, InterpreterActivity.class));
    }
}
