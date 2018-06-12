package me.jdvp.weatherappjava;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Component used to define the dependency modules that are used in the application
 *
 * Created by jdvp on 6/10/18.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AppModule.class,
                ViewsModule.class
        }
)
public interface AppComponent extends AndroidInjector<WeatherAppJavaApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<WeatherAppJavaApplication> {
    }
}
