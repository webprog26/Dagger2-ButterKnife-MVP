package com.developer.webprog26.dagger2butterknifemvp.di;

import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.MainFragment;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Created by webprog on 01.10.17.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(MainFragment mainFragment);
}
