package com.developer.webprog26.dagger2butterknifemvp.di;

import android.app.Activity;
import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.MainActivity;
import com.developer.webprog26.dagger2butterknifemvp.MainFragment;
import com.developer.webprog26.dagger2butterknifemvp.MainFragmentListener;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by webprog on 01.10.17.
 */
@Module (includes = BaseActivityModule.class, subcomponents = MainFragmentSubcomponent.class)
public abstract class MainActivityModule {

    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    mainFragmentInjectorFactory(MainFragmentSubcomponent.Builder builder);

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);
}
