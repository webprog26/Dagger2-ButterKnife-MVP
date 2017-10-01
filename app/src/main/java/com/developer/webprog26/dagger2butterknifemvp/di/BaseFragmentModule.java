package com.developer.webprog26.dagger2butterknifemvp.di;

import android.app.Fragment;
import android.app.FragmentManager;

import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by webprog on 01.10.17.
 */
@Module
public abstract class BaseFragmentModule {

    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    @Provides
    @Named(BaseFragmentModule.CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(BaseFragmentModule.FRAGMENT)Fragment fragment){
        return fragment.getChildFragmentManager();
    }
}
