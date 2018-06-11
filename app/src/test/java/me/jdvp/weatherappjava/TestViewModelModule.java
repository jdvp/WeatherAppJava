package me.jdvp.weatherappjava;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;

/**
 * Created by jdvp on 6/10/18.
 */

@Module
class TestViewModelModule {
    @Provides
    @Singleton
    ForecastViewModel forecastViewModel() {
        return Mockito.mock(ForecastViewModel.class);
    }
}
