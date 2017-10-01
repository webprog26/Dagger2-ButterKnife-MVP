package com.developer.webprog26.dagger2butterknifemvp.di;

import com.developer.webprog26.dagger2butterknifemvp.Example1Fragment;
import com.developer.webprog26.dagger2butterknifemvp.Example1FragmentModule;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by webprog on 01.10.17.
 */
@PerFragment
@Subcomponent(modules = Example1FragmentModule.class)
public interface Example1FragmentSubcomponent extends AndroidInjector<Example1Fragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Fragment> {
    }
}
