package com.yuloran.dagger2demo.net;

import com.yuloran.dagger2demo.mvp.model.WeatherBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Author & Date: Yuloran, 2017/9/25 1:16
 * Function:
 */

public interface XinZhiWeatherApi {

    @GET("{type}?key=hgnma6oz6sxxkit5&&language=zh-Hans&unit=c")
    Flowable<WeatherBean> getNowWeather(@Path("type") String type, @Query("location") String location);

}
