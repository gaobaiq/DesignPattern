package com.qcloud.design.state;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 状态模式 ---> 允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。
 *      何时使用:
 *      一个对象的行为依赖于它的状态，并且它必须在运行时根据状态改变它的行为。
 *      需要编写大量的条件分支语句来决定一个操作的行为，而且这些条件恰好表示对象的一种状态。
 *      优点:
 *      使用一个类封装对象的一种状态，很容易增加新的状态
 *      在状态模式中，环境（Context）中不必出现大量的条件判断语句。环境（Context）实例所呈现的状态变得更加清晰、容易理解。
 *      使用状态模式可以让用户程序很方便地切换环境（Context）实例的状态。
 *      使用状态模式不会让环境（Context）中的实例中出现内部状态不一致的情况。
 *      当状态对象没有实例变量时，环境（Context）的各个实例可以共享一个状态对象。
 *      说明:
 *      用一句话来表述，状态模式把所研究的对象的行为包装在不同的状态对象里，每一个状态对象都属于一个抽象状态类的一个子类。
 *      状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。
 * Author: gaobaiqiang
 * 2019-11-14 16:57.
 */
public class StateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smallData = "小数据";
                String middleData = "介于小数据和大数据之间的数据";
                String bigData = "这里就假定这是一个很大很大很大的数据";
                SaveDataController saveDataController = new SaveDataController();
                saveDataController.save(smallData);
                saveDataController.save(middleData);
                saveDataController.save(bigData);
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, StateActivity.class));
    }
}
