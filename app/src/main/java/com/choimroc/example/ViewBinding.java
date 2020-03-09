package com.choimroc.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author choimroc
 * @since 2020/3/9
 */
public interface ViewBinding<T> {

    @NonNull
    View getRoot();

    @NonNull
    T inflate(@NonNull LayoutInflater inflater);

    @NonNull
    T inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent);
}
