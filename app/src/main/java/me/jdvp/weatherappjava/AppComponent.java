package me.jdvp.weatherappjava;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.jdvp.weatherappjava.viewmodel.impl.ViewModelModule;

/**
 * Created by jdvp on 6/10/18.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ViewModelModule.class,
                ViewsModule.class
        }
)
public interface AppComponent extends AndroidInjector<WeatherAppJavaApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<WeatherAppJavaApplication> {
    }
}
