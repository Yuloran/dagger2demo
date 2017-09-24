package com.yuloran.dagger2demo;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.yuloran.dagger2demo.net.ApiManager;
import com.yuloran.dagger2demo.net.XinZhiWeatherApi;

/**
 * Author & Date: Yuloran, 2017/9/11 23:27
 * Function:
 */

public class App extends Application {

    private static XinZhiWeatherApi sWeatherApi;

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());

        sWeatherApi = ApiManager.initWeatherApi();
    }

    public static XinZhiWeatherApi getsWeatherApi() {
        return sWeatherApi;
    }
}
