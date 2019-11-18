package com.qcloud.design.visitor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Description: 访问者模式 ---> 表示一个作用于某对象结构中的各个元素的操作。它可以在不改变各个元素的类的前提下定义作用于这些元素的新操作。
 *      何时使用:
 *      一个对象结构中，比如某个集合中，包含很多对象，想对集合中的对象增加一些新的操作。
 *      需要对集合中的对象进行很多不同的并且不相关的操作，而不想修改对象的类，就可以使用访问者模式。访问者模式可以在Visitor类中集中定义一些关于集合中对象的操作。
 *      优点:
 *      可以在不改变一个集合中的元素的类的情况下，增加新的施加于该元素上的新操作。
 *      可以将集合中各个元素的某些操作集中到访问者中，不仅便于集合的维护，也有利于集合中元素的复用。
 *      说明:
 *      访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 * Author: gaobaiqiang
 * 2019-11-15 11:37.
 */
public class VisitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);

        findViewById(R.id.btn_visitor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Visitor appOwner = new APPOwner();
                ArrayList<User> users = new ArrayList<>();
                users.add(new UserOrdinary("普通用户短反馈"));
                users.add(new UserOrdinary("这是一个普通用户的比较长的反馈"));
                users.add(new UserVIP("VIP用户的短反馈"));
                users.add(new UserVIP("VIP用户的比较长的反馈反馈"));
                Iterator<User> iterator =  users.iterator();
                while(iterator.hasNext()){
                    iterator.next().accept(appOwner);
                }
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, VisitorActivity.class));
    }
}
