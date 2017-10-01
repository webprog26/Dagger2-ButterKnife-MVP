package com.developer.webprog26.dagger2butterknifemvp.di.singleton_utils;

import android.app.Activity;

import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import javax.inject.Inject;

/**
 * Created by webprog on 01.10.17.
 */
@PerActivity
public final class PerActivityUtil {

    private final Activity activity;

    @Inject
    PerActivityUtil(Activity activity) {
        this.activity = activity;
    }

    public String doSomething() {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode();
    }
}
