package com.yuloran.dagger2demo.mvp.contract;

import android.widget.TextView;

import com.yuloran.dagger2demo.mvp.model.StudentBean;

/**
 * Author & Date: Yuloran, 2017/9/11 23:11
 * Function:
 */

public interface IMainContract {
    interface IMainView extends IBaseView<StudentBean> {
    }


    interface IMainPresenter<T> extends IBasePresenter<StudentBean> {
    }

}
