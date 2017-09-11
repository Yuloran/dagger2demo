package com.yuloran.dagger2demo.di.module;

import com.yuloran.dagger2demo.mvp.contract.IMainContract;

import dagger.Module;
import dagger.Provides;

/**
 * Author & Date: Yuloran, 2017/9/11 23:29
 * Function:
 */
@Module
public class MainModule {
    private IMainContract.IMainView mView;

    public MainModule(IMainContract.IMainView mView) {
        this.mView = mView;
    }

    @Provides
    IMainContract.IMainView provideMainView() {
        return mView;
    }
}
