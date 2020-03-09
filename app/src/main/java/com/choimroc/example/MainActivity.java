package com.choimroc.example;

import android.os.Bundle;

/**
 * @author choimroc
 * @since 2020/3/9
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setToolbarTitle("使用ViewBinding");
        viewBinding.tvContent.setText("继承了BaseActivity");
    }

    @Override
    protected Class<ActivityMainBinding> getViewBinding() {
        return ActivityMainBinding.class;
    }
}
