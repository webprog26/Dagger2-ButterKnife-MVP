package com.developer.webprog26.dagger2butterknifemvp.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by webprog on 01.10.17.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
