package me.jdvp.weatherappjava;



import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.jdvp.weatherappjava.activity.MainActivityTest;

/**
 * Test App component used for replacing injected members with mocks for Robolectric testing.
 * Also serves to inject actual Robolectric test classes
 *
 * Created by jdvp on 6/10/18.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                TestAppModule.class,
                ViewsModule.class
        }
)
public interface TestAppComponent extends AndroidInjector<WeatherAppJavaApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<WeatherAppJavaApplication> {
    }

    void inject(MainActivityTest mainActivityTest);
}
