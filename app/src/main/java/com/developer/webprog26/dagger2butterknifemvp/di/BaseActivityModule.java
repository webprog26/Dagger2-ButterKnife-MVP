package com.developer.webprog26.dagger2butterknifemvp.di;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;

import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


/**
 * Created by webprog on 01.10.17.
 */
@Module
public abstract class BaseActivityModule {

    public static final String ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager";

    @Binds
    @PerActivity
    public abstract Context activityContext(Activity activity);

    @Provides
    @Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
    @PerActivity
    static FragmentManager activityFrafmentManager(Activity activity){
        return activity.getFragmentManager();
    }

}
