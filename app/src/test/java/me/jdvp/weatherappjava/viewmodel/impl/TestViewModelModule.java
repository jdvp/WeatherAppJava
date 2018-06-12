package me.jdvp.weatherappjava.viewmodel.impl;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;
import me.jdvp.weatherappjava.viewmodel.LocationViewModel;

/**
 * Test module that mirrors ViewModelModule but mocks the dependencies
 *
 * Created by jdvp on 6/10/18.
 */

@Module
public class TestViewModelModule {
    @Provides
    @Singleton
    ForecastViewModel forecastViewModel() {
        return Mockito.mock(ForecastViewModel.class);
    }

    @Provides
    @Singleton
    LocationViewModel locationViewModel() {
        return Mockito.mock(LocationViewModel.class);
    }
}
