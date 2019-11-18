package com.qcloud.design.plyweight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qcloud.design.R;

/**
 * Description: 享元模式 ---> 运用共享技术有效地支持大量细粒度的对象。
 *      何时使用:
 *      一个应用程序使用大量的对象，这些对象之间部分属性本质上是相同的，这时应使用享元来封装相同的部分。
 *      对象的多数状态都可变为外部状态，就可以考虑将这样的对象作为系统中发的享元来使用。
 *      优点:
 *      使用享元可以节省内存的开销，特别适合处理大量细粒度对象，这些对象的许多属性值是相同的，而且一旦创建则不允许修改。
 *      享元模式中的享元可以使用方法的参数接收外部状态中的数据，但外部状态数据不会干扰到享元中的内部数据，这就使享元可以在不同的环境中被共享。
 *      享元模式包括三种角色:
 *      享元接口（Plyweight）：定义了对外公开的获取其内部数据和接收外部数据的方法。
 *      具体享元（Concrete Plyweight）：享元接口的实现。
 *      享元工厂（Plyweight Factory）：该类的实例负责创建和管理享元对象，用户或其他对象必须请求他以获取一个享元对象。
 *      说明:
 *      享元模式的优点在于它大幅度地降低内存中对象的数量。但是，它做到这一点所付出的代价也是很高的：享元模式使得系统更加复杂。
 *          为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。享元模式将享元对象的状态外部化，
 *          而读取外部状态使得运行时间变长。
 * Author: gaobaiqiang
 * 2019-11-15 15:53.
 */
public class PlyweightActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plyweight);

        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherFactory factory = new WeatherFactory();

                IWeather weather1, weather2, weather3, weather4, weather5, weather6, weather7, weather8;
                weather1 = factory.getFlyWeight("多云",15);
                weather2 = factory.getFlyWeight("晴",23);
                weather3 = factory.getFlyWeight("多云",16);
                weather4 = factory.getFlyWeight("阴",10);
                weather5 = factory.getFlyWeight("多云",15);
                weather6 = factory.getFlyWeight("多云",15);
                weather7 = factory.getFlyWeight("多云",15);
                weather8 = factory.getFlyWeight("多云",15);
                weather1.printWeather();
                weather2.printWeather();
                weather3.printWeather();
                weather4.printWeather();
                weather5.printWeather();
                weather6.printWeather();
                weather7.printWeather();
                weather8.printWeather();
                Log.e("PLYWIEGHT", "实际对象个数" + factory.getFlyweightSize());
            }
        });
    }

    public static void openActivity(Context context) {
        context.startActivity(new Intent(context, PlyweightActivity.class));
    }
}
