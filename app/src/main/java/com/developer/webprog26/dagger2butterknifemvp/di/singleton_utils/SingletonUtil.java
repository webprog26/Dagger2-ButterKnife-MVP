package com.developer.webprog26.dagger2butterknifemvp.di.singleton_utils;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by webprog on 01.10.17.
 */
@Singleton
public final class SingletonUtil {

    @Inject
    SingletonUtil(){}

    public String doSomething() {
        return "SingletonUtil: " + hashCode();
    }
}
