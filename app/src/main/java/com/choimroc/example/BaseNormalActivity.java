package com.choimroc.example;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * without ViewBinding
 *
 * @author choimroc
 * @since 2020/3/20
 */
public abstract class BaseNormalActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup rootView = (ViewGroup) getLayoutInflater().inflate(R.layout.activity_base, null);
        setContentView(rootView);
        toolbar = findViewById(R.id.toolbar);
        getLayoutInflater().inflate(getLayoutRes(), rootView, true);
    }

    protected abstract int getLayoutRes();

    public void setToolbarTitle(CharSequence title) {
        toolbar.setTitle(title);
    }

    public void setToolbarTitle(@StringRes int stringId) {
        toolbar.setTitle(stringId);
    }
}
