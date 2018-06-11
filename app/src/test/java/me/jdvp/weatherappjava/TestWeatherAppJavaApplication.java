package me.jdvp.weatherappjava;

import dagger.android.AndroidInjector;

/**
 * Test application we use for Robolectric to ensure we can inject mocks into our activities
 * and tests
 *
 * Created by jdvp on 6/10/18.
 */

public class TestWeatherAppJavaApplication extends WeatherAppJavaApplication {
    AndroidInjector<WeatherAppJavaApplication> injector;

    @Override
    public AndroidInjector<WeatherAppJavaApplication> applicationInjector() {
        if (injector == null) {
            injector = DaggerTestAppComponent.builder().create(this);
        }

        return injector;
    }

    public TestAppComponent getTestAppComponent() {
        return (TestAppComponent) applicationInjector();
    }
}
