package com.developer.webprog26.dagger2butterknifemvp.di;

import com.developer.webprog26.dagger2butterknifemvp.MainFragment;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by webprog on 01.10.17.
 */
@PerFragment
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment>{

    }
}
