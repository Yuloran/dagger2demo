package com.yuloran.dagger2demo.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yuloran.dagger2demo.R;
import com.yuloran.dagger2demo.di.component.DaggerMainComponent;
import com.yuloran.dagger2demo.di.module.MainModule;
import com.yuloran.dagger2demo.mvp.contract.IMainContract;
import com.yuloran.dagger2demo.mvp.model.StudentBean;
import com.yuloran.dagger2demo.mvp.presenter.MainPresenter;

import javax.inject.Inject;


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
    public void show(StudentBean studentBean) {
        Toast.makeText(this, studentBean.toString(), Toast.LENGTH_SHORT).show();
    }
}
