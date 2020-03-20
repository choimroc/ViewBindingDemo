package com.choimroc.example;

import android.os.Bundle;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author choimroc
 * @since 2020/3/9
 */
public abstract class BaseActivity<T extends ViewBinding> extends AppCompatActivity {
    public ActivityBaseBinding baseBinding;
    public T viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseBinding = ActivityBaseBinding.newInstance().inflate(getLayoutInflater());
        setContentView(baseBinding.getRoot());
        try {
            viewBinding = getViewBinding().newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException("create BaseActivity error");
        }
        viewBinding.inflate(getLayoutInflater(),  baseBinding.getRoot(), true);
    }

    protected abstract Class<T> getViewBinding();

    public void setToolbarTitle(CharSequence title) {
        baseBinding.toolbar.setTitle(title);
    }

    public void setToolbarTitle(@StringRes int stringId) {
        baseBinding.toolbar.setTitle(stringId);
    }
}
