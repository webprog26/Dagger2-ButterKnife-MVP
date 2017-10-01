package com.developer.webprog26.dagger2butterknifemvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by webprog on 01.10.17.
 */

public final class Example1Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_1_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new Example1Fragment());
        }
    }
}
