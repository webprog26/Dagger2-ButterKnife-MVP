package com.developer.webprog26.dagger2butterknifemvp.di;

import com.developer.webprog26.dagger2butterknifemvp.MainActivity;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by webprog on 01.10.17.
 */
@PerActivity
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
