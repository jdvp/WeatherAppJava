package me.jdvp.weatherappjava.api.impl;

import android.content.Context;

import com.google.android.gms.location.FusedLocationProviderClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.api.LocationAPI;
import me.jdvp.weatherappjava.service.ForecastService;
import me.jdvp.weatherappjava.service.ServiceModule;

/**
 * Module for providing API level and lower dependencies
 *
 * Created by jdvp on 6/10/18.
 */
@Module(
        includes = ServiceModule.class
)
public class APIModule {
    @Provides
    @Singleton
    ForecastAPI forecastAPI(ForecastService forecastService) {
        return new ForecastAPIImpl(forecastService);
    }

    @Provides
    @Singleton
    LocationAPI locationAPI(FusedLocationProviderClient fusedLocationProviderClient, Context context) {
        return new LocationAPIImpl(fusedLocationProviderClient, context);
    }
}
