package com.qcloud.design.command;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.qcloud.design.R;

/**
 * Description: 命令模式 ---> 将一个请求封装为一个对象，从而使用户可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
 *      何时使用:
 *      程序需要在不同的时刻指定、排列和执行请求。
 *      程序需要提供撤销操作。
 *      程序需要支持宏操作。
 *      优点:
 *      在命令模式中，请求者（Invoker）不直接与接受者（Receiver）交互，及请求者（Invoker）不包含接受者（Receiver）的引用，因此彻底消除了彼此间的耦合。
 *      命令模式满足“开-闭原则”。如果增加新的具体命令和该命令的接受者，不必修改调用者的代码，调用者就可以使用新的命令对象；反之，如果增加新的调用者，不必修改现有具体命令和接收者，新增加的调用者就可以使用已有的具体命令。
 *      由于请求者的请求被封装到具体的命令中，那么就可以将具体命令保存到持久化的媒介中，在需要的时候，重新执行这个具体命令。因此，使用命令模式可以记录日志。
 *      使用命令模式可以对请求者的“请求”进行排队。每个请求都各自对应一个具体命令，因此可以按一定顺序执行这些具体命令。
 *      说明:
 *      一个对象有多种操作，但是我们不希望调用者（请求者）直接使用，我们就额外添加一个对象，然后让调用者通过这个对象来使用那些操作。
 * Author: gaobaiqiang
 * 2019-11-14 11:24.
 */
public class CommandActivity extends AppCompatActivity {
    private AppCompatTextView mTvLog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        mTvLog = findViewById(R.id.tv_log);

        //接收者
        Printer printer = new Printer();
        //命令
        final AddCommand add = new AddCommand(printer);
        final PollCommand poll = new PollCommand(printer);
        //请求者
        final PrintClient client = new PrintClient();
        //执行命令
        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    client.setCommand(add);
                    client.executeCommand("旗云科技");
                    client.executeCommand("南方软件园");
                    client.executeCommand("电话:3399366");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_poll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    client.setCommand(poll);
                    StringBuffer sb = new StringBuffer();
                    String log = client.executeCommand("");
                    while (log != null) {
                        sb.append(log);
                        sb.append(",");
                        log = client.executeCommand("");
                    }
                    mTvLog.setText(new String(sb));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, CommandActivity.class));
    }
}
