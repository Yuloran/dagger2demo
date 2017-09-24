package com.yuloran.dagger2demo.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.yuloran.dagger2demo.App;
import com.yuloran.dagger2demo.R;
import com.yuloran.dagger2demo.di.component.DaggerMainComponent;
import com.yuloran.dagger2demo.di.module.MainModule;
import com.yuloran.dagger2demo.mvp.contract.IMainContract;
import com.yuloran.dagger2demo.mvp.model.StudentBean;
import com.yuloran.dagger2demo.mvp.model.WeatherBean;
import com.yuloran.dagger2demo.mvp.presenter.MainPresenter;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity implements IMainContract.IMainView {

    @Inject
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        mPresenter.start();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Flowable.just("Hello world")
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        Logger.d(s);
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();

        App.getsWeatherApi().getNowWeather("now.json", "nanjing")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WeatherBean>() {
                    @Override
                    public void accept(WeatherBean weatherBean) throws Exception {
                        Logger.d(weatherBean);
                    }
                });
    }

    @Override
    public void show(StudentBean studentBean) {
        Toast.makeText(this, studentBean.toString(), Toast.LENGTH_SHORT).show();
    }
}
