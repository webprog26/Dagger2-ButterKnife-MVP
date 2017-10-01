package com.developer.webprog26.dagger2butterknifemvp.di;

import com.developer.webprog26.dagger2butterknifemvp.Example1Activity;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by webprog on 01.10.17.
 */
@PerActivity
@Subcomponent(modules = Example1ActivityModule.class)
public interface Example1ActivitySubcomponent extends AndroidInjector<Example1Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Activity> {
    }
}
