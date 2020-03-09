package com.choimroc.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * @author choimroc
 * @since 2020/3/9
 */
public final class ActivityMainBinding implements ViewBinding<ActivityMainBinding> {
    @NonNull
    private ConstraintLayout rootView;

    @NonNull
    public TextView tvContent;

    @Override
    @NonNull
    public ConstraintLayout getRoot() {
        return rootView;
    }

    public static ActivityMainBinding newInstance() {
        return new ActivityMainBinding();
    }

    @NonNull
    @Override
    public ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    @Override
    public ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
                                       @Nullable ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    @NonNull
    public ActivityMainBinding bind(@NonNull View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        String missingId;
        missingId:
        {
            TextView tvContent = rootView.findViewById(R.id.tv_content);
            if (tvContent == null) {
                missingId = "tvContent";
                break missingId;
            }
            this.rootView = (ConstraintLayout) rootView;
            this.tvContent = tvContent;
            return this;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
