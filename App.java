package com.example.wb_lwx502637.textdemotwo;

import android.app.Application;

import com.example.mylibrary.ToastUtils;

/**
 * Created by wb-lwx502637 on 2019/2/20.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ToastUtils.logs();
    }
}
