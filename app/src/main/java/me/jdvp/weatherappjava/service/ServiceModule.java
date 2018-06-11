package me.jdvp.weatherappjava.service;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Module used for providing services
 *
 * Created by jdvp on 6/10/18.
 */
@Module
public class ServiceModule {

    @Provides
    @Singleton
    ForecastService forecastService() {
        return ServiceCreator.create(ForecastService.class);
    }
}
