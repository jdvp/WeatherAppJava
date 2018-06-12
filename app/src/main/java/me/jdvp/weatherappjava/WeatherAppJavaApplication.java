package me.jdvp.weatherappjava;

import android.content.Context;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class WeatherAppJavaApplication extends DaggerApplication {
    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this.getApplicationContext();
    }
    @Override
    public AndroidInjector<WeatherAppJavaApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    public static Context getApplicationContextInstance() {
        return applicationContext;
    }
}
