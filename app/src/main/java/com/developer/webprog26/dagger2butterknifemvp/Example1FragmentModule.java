package com.developer.webprog26.dagger2butterknifemvp;

import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.di.BaseFragmentModule;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by webprog on 01.10.17.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class Example1FragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example1Fragment the example 1 fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example1Fragment example1Fragment);
}
