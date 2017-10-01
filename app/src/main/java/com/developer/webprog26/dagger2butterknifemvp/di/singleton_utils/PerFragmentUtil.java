package com.developer.webprog26.dagger2butterknifemvp.di.singleton_utils;

import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.di.BaseFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by webprog on 01.10.17.
 */

public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT) Fragment fragment) {
        this.fragment = fragment;
    }

    public String doSomething() {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode();
    }
}
