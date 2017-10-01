package com.developer.webprog26.dagger2butterknifemvp.di.singleton_utils;

import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.di.BaseChildFragmentModule;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerChildFragment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by webprog on 01.10.17.
 */
@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }

    public String doSomething() {
        return "PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode();
    }
}
