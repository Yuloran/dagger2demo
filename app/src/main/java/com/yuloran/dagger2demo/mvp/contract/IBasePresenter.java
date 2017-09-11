package com.yuloran.dagger2demo.mvp.contract;

/**
 * Author & Date: Yuloran, 2017/9/11 23:09
 * Function:
 */

public interface IBasePresenter<T> {
    void start();

    void cancel();

    void onLoadSuccess(T t);

    void onLoadFailed(String str);
}
