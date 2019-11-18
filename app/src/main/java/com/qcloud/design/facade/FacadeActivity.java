package com.qcloud.design.facade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 外观模式 ---> 为系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *      说明:
 *      外观模式是一种很简单的模式，我们有意无意都在使用这种模式。
 * Author: gaobaiqiang
 * 2019-11-18 09:35.
 */
public class FacadeActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        mTvLog = findViewById(R.id.tv_log);

        findViewById(R.id.btn_buy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object info = ProductSalesman.getInstance.buySomething("银河飞船", "地球", "K1234523");

                mTvLog.setText(info.toString());
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, FacadeActivity.class));
    }
}
