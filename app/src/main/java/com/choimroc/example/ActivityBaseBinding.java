package com.choimroc.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

/**
 * @author choimroc
 * @since 2020/3/9
 */
public final class ActivityBaseBinding implements ViewBinding<ActivityBaseBinding> {

    @NonNull
    private LinearLayout rootView;

    @NonNull
    public Toolbar toolbar;

    @NonNull
    public FrameLayout viewContainer;

    @NonNull
    @Override
    public View getRoot() {
        return rootView;
    }

    public static ActivityBaseBinding newInstance() {
        return new ActivityBaseBinding();
    }

    @NonNull
    @Override
    public ActivityBaseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    @Override
    public ActivityBaseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_base, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    @NonNull
    public ActivityBaseBinding bind(@NonNull View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        String missingId;
        missingId:
        {
            Toolbar toolbar = rootView.findViewById(R.id.toolbar);
            if (toolbar == null) {
                missingId = "toolbar";
                break missingId;
            }
            FrameLayout viewContainer = rootView.findViewById(R.id.view_container);
            if (viewContainer == null) {
                missingId = "viewContainer";
                break missingId;
            }

            this.rootView = (LinearLayout) rootView;
            this.toolbar = toolbar;
            this.viewContainer = viewContainer;
            return this;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
