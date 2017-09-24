package com.yuloran.dagger2demo.mvp.model;

import com.yuloran.dagger2demo.mvp.contract.IBaseModel;
import com.yuloran.dagger2demo.mvp.presenter.MainPresenter;

/**
 * Author & Date: Yuloran, 2017/9/11 23:14
 * Function:
 */

public class MainModel implements IBaseModel {
    MainPresenter mPresenter;

    public MainModel(MainPresenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    @Override
    public void start() {
        mPresenter.onLoadSuccess(new StudentBean("刘德华"));
    }

    @Override
    public void cancel() {

    }
}
