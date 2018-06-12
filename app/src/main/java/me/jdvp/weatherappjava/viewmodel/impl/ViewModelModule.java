package me.jdvp.weatherappjava.viewmodel.impl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.api.LocationAPI;
import me.jdvp.weatherappjava.api.impl.APIModule;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;
import me.jdvp.weatherappjava.viewmodel.LocationViewModel;

/**
 * Module that provides View Models and lower dependencies
 *
 * Created by jdvp on 6/10/18.
 */
@Module(
        includes = {APIModule.class}
)
public class ViewModelModule {
    @Provides
    @Singleton
    ForecastViewModel forecastViewModel(ForecastAPI forecastAPI, LocationAPI locationAPI) {
        return new ForecastViewModelImpl(forecastAPI, locationAPI);
    }

    @Provides
    @Singleton
    LocationViewModel locationViewModel(LocationAPI locationAPI) {
        return new LocationViewModelImpl(locationAPI);
    }
}
