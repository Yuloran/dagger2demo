package com.yuloran.dagger2demo.mvp.presenter;

import com.yuloran.dagger2demo.mvp.contract.IMainContract;
import com.yuloran.dagger2demo.mvp.model.MainModel;
import com.yuloran.dagger2demo.mvp.model.StudentBean;

import javax.inject.Inject;

/**
 * Author & Date: Yuloran, 2017/9/11 23:20
 * Function:
 */

public class MainPresenter implements IMainContract.IMainPresenter<StudentBean> {

    IMainContract.IMainView mView;
    MainModel mModel;

    @Inject
    public MainPresenter(IMainContract.IMainView view) {
        mView = view;
        mModel = new MainModel(this);
    }

    @Override
    public void start() {
        mModel.start();
    }

    @Override
    public void cancel() {

    }

    @Override
    public void onLoadSuccess(StudentBean studentBean) {
        mView.show(studentBean);
    }

    @Override
    public void onLoadFailed(String str) {

    }
}
