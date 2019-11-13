package com.qcloud.design.singleton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 单例模式 ---> 保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *      何时使用：
 *      当系统需要某个类只有一个实例的时候
 *      优点：
 *      单例模式的类唯一实例由其本身控制，可以很好的控制用户何时访问它
 *      在使用这个模式的时候，我们要考虑是否会在多线程中使用
 * Author: gaobaiqiang
 * 2019-11-08 11:46.
 */
public class SingletonActivity extends AppCompatActivity {
    private static final String TAG = "SingletonActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        // 单线程
        findViewById(R.id.btn_simple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, SimpleSingleton.getInstance().getData());
            }
        });

        // 多线程
        findViewById(R.id.btn_thread).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Log.e(TAG, EnumSingleton.getInstance.getData() + System.currentTimeMillis());
                    }
                }).start();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d(TAG, EnumSingleton.getInstance.getData() + System.currentTimeMillis());
                    }
                }).start();
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, SingletonActivity.class));
    }
}
