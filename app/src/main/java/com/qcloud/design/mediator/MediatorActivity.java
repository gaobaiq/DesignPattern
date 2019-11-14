package com.qcloud.design.mediator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 中介者模式 ---> 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示的相互引用，从而使其耦合松散，而且可以独立的改变他们之前的交互。
 *      优点:
 *      两个类直接关联，是很好实现的，但如果不希望两个类直接发生交互，那么就需要使用中介者模式了。
 *      说明:
 *      比如有两个类，他们都是做持久化的，一个负责将数据写入文件，一个负责将数据写入数据库。
 *      他们谁先接收到数据是不确定的，但是要确保其中一个接收到数据后，另外一个也必须完成这些数据的持久化。
 *      如果我们直接将两个类关联在一起，互相调用是可以实现的，但不利于后期扩展或维护
 *      （比如再添加一个持久化组建，则原有的组建可能都需要修改），此时，若添加一个中介者，来协调他们，事儿就好办多了
 * Author: gaobaiqiang
 * 2019-11-14 15:14.
 */
public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);

        findViewById(R.id.btn_get_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object data = "数据";
                PersistentDB persistentDB = new PersistentDB();
                PersistentFile persistentFile = new PersistentFile();

                Mediator mediator = new Mediator();
                mediator.setPersistentDB(persistentDB).setPersistentFile(persistentFile);
                persistentDB.getData(data, mediator);
                persistentFile.getData(data, mediator);
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, MediatorActivity.class));
    }
}
