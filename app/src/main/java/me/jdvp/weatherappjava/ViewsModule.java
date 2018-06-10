package me.jdvp.weatherappjava;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.jdvp.weatherappjava.activity.MainActivity;

/**
 * Created by jdvp on 6/10/18.
 */
@Module
abstract class ViewsModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
