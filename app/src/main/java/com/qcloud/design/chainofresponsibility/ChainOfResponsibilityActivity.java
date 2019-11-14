package com.qcloud.design.chainofresponsibility;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 责任链模式 ---> 使很多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 *                              将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *      何时使用:
 *      有许多对象可以处理用户请求，希望程序在运行期间自动确定处理用户的那个对象。
 *      希望用户不必明确指定接收者的情况下，想多个接受者的一个提交请求
 *      程序希望动态地指定可处理用户请求的对象集合
 *      优点:
 *      低耦合
 *      可以动态的添加删除处理者或重新指派处理者的职责
 *      可以动态改变处理者之间的先后顺序
 *      说明:
 *      通常来说，一个纯粹的责任链是先传给第一个处理，如果处理过了，这个请求处理就此结束，如果没有处理，再传给下一个处理者。
 * Author: gaobaiqiang
 * 2019-11-14 10:02.
 */
public class ChainOfResponsibilityActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility);

        mTvLog = findViewById(R.id.tv_log);

        final Handler handler1, handler2, handler3;
        handler1 = new Handler1();
        handler2 = new Handler2();
        handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        findViewById(R.id.btn_request).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log = "" + handler1.handleRequest(-5) + "," + handler1.handleRequest(99) + "," + handler1.handleRequest(8);
                mTvLog.setText(log);
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, ChainOfResponsibilityActivity.class));
    }
}
