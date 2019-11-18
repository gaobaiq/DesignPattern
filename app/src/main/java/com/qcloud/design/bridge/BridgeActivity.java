package com.qcloud.design.bridge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 桥接模式 ---> 将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 *      何时使用:
 *      不想让抽象和某些重要的实现代码是固定的绑定关系，这部分实现可运行时动态决定。
 *      抽象和实现者都可以继承当方式独立地扩充而互不影响，程序在运行期间可能需要动态的将一个抽象的子类的实例与一个实现者的子类的实例进行组合。
 *      希望对实现者层次代码的修改对抽象层不产生影响，即抽象层的代码不需要重新编译，反之亦然。
 *      优点:
 *      桥接模式分离实现与抽象，使抽象可实现可以独立的扩展。当修改实现的代码时，不影响抽象的代码，反之也一样。
 *      满足开闭-原则，抽象和实现者处于同层次，使系统可独立的扩展这两个层次。增加新的具体实现者，不需要修改细化抽象，反之增加新的细化抽象也不需要修改具体实现。
 *      说明:
 *      桥接模式是一种结构型模式，它主要应对的是：由于实际的需要，某个类具有两个或两个以上的维度变化，如果只是用继承将无法实现这种需要，或者使得设计变得相当臃肿。
 *          桥接模式的做法是把变化部分抽象出来，使变化部分与主类分离开来，从而将多个维度的变化彻底分离。
 *          最后，提供一个管理类来组合不同维度上的变化，通过这种组合来满足业务的需要。
 *      桥接模式中有4种角色:
 *      抽象
 *      细化抽象
 *      实现者
 *      具体实现者
 * Author: gaobaiqiang
 * 2019-11-18 09:58.
 */
public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object data = "数据";
                ISaveData saveDataDb = new SaveToDB();
                ISaveData saveDataFile = new SaveToFile();
                AbstractSave save;
                save = new NetSave(saveDataDb);
                save.save(data);
                save = new NetSave(saveDataFile);
                save.save(data);
                save = new LocalSave(saveDataDb);
                save.save(data);
                save = new LocalSave(saveDataFile);
                save.save(data);
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, BridgeActivity.class));
    }
}
