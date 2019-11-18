package com.qcloud.design.proxy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 代理模式 ---> 为其它对象提供一种代理以控制对这个对象的访问。
 *      何时使用:
 *      程序可能不希望用户直接访问该对象，而是提供一个特殊的对象以控制对当前对象的访问。
 *      如果一个对象（例如很大的图像）需要很长时间才能完成加载。
 *      如果对象位于远程主机上，需要为用户提供访问该远程对象的能力。
 *      优点:
 *      代理模式可以屏蔽用户真正请求的对象，是用户程序和正在的对象解耦。
 *      使用代理来担当那些创建耗时的对象的替身。
 *      说明:
 *      一个用户不想或者不能够直接引用一个对象（或者设计者不希望用户直接访问该对象），
 *          而代理对象可以在客户端和目标对象之间起到中介的作用。而且这个代理对象中，我们可以做更多的操作。
 * Author: gaobaiqiang
 * 2019-11-15 14:57.
 */
public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);

        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbstractObject obj = new ProxyObject();
                obj.method1();
                obj.method2();
                obj.method3();
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, ProxyActivity.class));
    }
}
