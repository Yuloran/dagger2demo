package com.yuloran.dagger2demo.di.component;

import com.yuloran.dagger2demo.di.module.MainModule;
import com.yuloran.dagger2demo.mvp.view.MainActivity;

import dagger.Component;

/**
 * Author & Date: Yuloran, 2017/9/11 23:29
 * Function:
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
