package me.jdvp.weatherappjava;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.jdvp.weatherappjava.activity.MainActivity;
import me.jdvp.weatherappjava.fragment.ForecastFragment;
import me.jdvp.weatherappjava.fragment.LocationSelectionFragment;

/**
 * Created by jdvp on 6/10/18.
 */
@Module
abstract class ViewsModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract ForecastFragment forecastFragment();

    @ContributesAndroidInjector
    abstract LocationSelectionFragment locationSelectionFragment();
}
