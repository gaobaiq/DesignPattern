package com.qcloud.design.iterator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 迭代器模式 ---> 提供一种方法顺序访问一个聚合对象中的各个元素，而由不需要暴露该对象的内部细节。
 *      何时使用:
 *      让用户访问集合汇总的对象而不想暴露这个集合的实现时
 *      对不同集合提供一个统一的遍历接口时
 *      优点:
 *      用户使用迭代器访问集合中的对象而不需要知道这个集合的具体实现
 *      可以同时使用多个迭代器遍历一个集合
 *      说明:
 *      其中主要的角色是集合、具体集合、迭代器、具体迭代器。
 * Author: gaobaiqiang
 * 2019-11-14 14:19.
 */
public class IteratorActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);

        // 分别定义两种结构
        final MyList<String> array = new MyArrayList<>();
        final MyList<String> link = new MyLinkedList<>();

        // 添加数据
        for(int i = 0; i < 15; i++){
            array.add(i + "");
            link.add(i + "");
        }

        mTvLog = findViewById(R.id.tv_log);

        // 数组操作
        findViewById(R.id.btn_array).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                sb.append(array.remove());
                sb.append("\n");
                sb.append(array.get(5));
                sb.append("\n");
                sb.append(array.remove(5));
                sb.append("\n");
                sb.append(array.get(5));
                sb.append("\n");
                sb.append(array.remove("7"));
                sb.append("\n");
                sb.append(array.set(0, "00"));
                sb.append("\n");

                // 使用迭代器
                MyIterator<String> ai = array.iterator();
                while(ai.hasNext()) {
                    sb.append(ai.next());
                    sb.append(",");
                }
                sb.append("\nsize = ");
                sb.append(array.size());
                mTvLog.setText(new String(sb));
            }
        });

        // 链表操作
        findViewById(R.id.btn_link).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                sb.append(link.remove());
                sb.append("\n");
                sb.append(link.get(5));
                sb.append("\n");
                sb.append(link.remove(5));
                sb.append("\n");
                sb.append(link.get(5));
                sb.append("\n");
                sb.append(link.remove("7"));
                sb.append("\n");
                sb.append(link.set(0, "00"));
                sb.append("\n");

                // 使用迭代器
                MyIterator<String> ai = link.iterator();
                while(ai.hasNext()) {
                    sb.append(ai.next());
                    sb.append(",");
                }
                sb.append("\nsize = ");
                sb.append(link.size());
                mTvLog.setText(new String(sb));
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, IteratorActivity.class));
    }
}
