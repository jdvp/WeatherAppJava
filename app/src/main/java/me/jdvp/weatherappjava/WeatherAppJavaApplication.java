package me.jdvp.weatherappjava;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by jdvp on 6/10/18.
 */

public class WeatherAppJavaApplication extends DaggerApplication {
    @Override
    public AndroidInjector<WeatherAppJavaApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
