package com.developer.webprog26.dagger2butterknifemvp.di;

import android.app.Activity;
import android.app.Fragment;

import com.developer.webprog26.dagger2butterknifemvp.Example1Activity;
import com.developer.webprog26.dagger2butterknifemvp.Example1Fragment;
import com.developer.webprog26.dagger2butterknifemvp.di.scopes.PerActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by webprog on 01.10.17.
 */
@Module(includes = BaseActivityModule.class, subcomponents = Example1FragmentSubcomponent.class)
public abstract class Example1ActivityModule {

    /**
     * Provides the injector for the {@link Example1Fragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example1Fragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example1FragmentInjectorFactory(Example1FragmentSubcomponent.Builder builder);

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must rovide a concrete implementation of {@link Activity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * BaseActivity.
     *
     * @param example1Activity the example 1 activity
     * @return the activity
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example1Activity example1Activity);
}
