package com.qcloud.design.memento;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 备忘录模式 ---> 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存该状态，这样就可以将该对象恢复到之前保存的状态。
 *      何时使用:
 *      必须保存一个对象在某一时刻的全部或部分状态，以便在需要时恢复该对象先前的状态。
 *      一个对象不想通过提供public权限的，诸如getXXX()的方法让其他对象得到自己IDE内部状态。
 *      优点:
 *      备忘录模式使用备忘录可以吧原先者的内部状态全部保存起来，使是有很“亲密”的对象可以访问备忘录中的数据。
 *      备忘录模式强调了类设计单一责任的原则，即将状态的刻画和保存分开。
 *      说明:
 *      备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是对象的行为模式。 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象
 *      备忘录模式中有三种角色:
 *      备忘录(Memento)角色：将发起人（Originator）对象的内战状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人（Originator）对象的内部状态。
 *          备忘录可以保护其内容不被发起人（Originator）对象之外的任何对象所读取。
 *      发起人（Originator）角色：创建一个含有当前的内部状态的备忘录对象。使用备忘录对象存储其内部状态。
 *      负责人（Caretaker）角色：负责保存备忘录对象。不检查备忘录对象的内容。
 * Author: gaobaiqiang
 * 2019-11-15 09:40.
 */
public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);

        final MyTextEditor editor = new MyTextEditor("这里是初始文本，可能为文件中读取的值。");

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.append("添加文字1");
            }
        });

        findViewById(R.id.btn_del).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.delWords();
            }
        });

        findViewById(R.id.btn_recovery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //恢复大于实际修改的次数不会出错，只会将文本设为0初始化状态
                for (int i=0; i<10; i++) {
                    editor.recoverMemento();
                }
            }
        });

        findViewById(R.id.btn_redo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重做大于实际恢复的次数不会出错，只会将文本设为最后状态
                for(int i=0; i<10; i++) {
                    editor.redo();
                }
            }
        });

        findViewById(R.id.btn_recovery2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //恢复大于实际修改的次数不会出错，只会将文本设为0初始化状态
                for(int i=0; i<10; i++) {
                    editor.recoverMemento();
                }
            }
        });

        findViewById(R.id.btn_redo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 重做大于实际恢复的次数不会出错，只会将文本设为最后状态
                for(int i=0; i<10; i++) {
                    editor.redo();
                }
            }
        });

        findViewById(R.id.btn_recovery3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //恢复大于实际修改的次数不会出错，只会将文本设为0初始化状态
                for(int i=0; i<10; i++) {
                    editor.recoverMemento();
                }
            }
        });

        findViewById(R.id.btn_add2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.append("添加文字2");
            }
        });

        findViewById(R.id.btn_redo3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重做大于实际恢复的次数不会出错，只会将文本设为最后状态
                for(int i=0; i<10; i++) {
                    editor.redo();
                }
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, MementoActivity.class));
    }
}
