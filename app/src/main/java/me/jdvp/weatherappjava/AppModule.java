package me.jdvp.weatherappjava;

import android.content.Context;

import com.google.android.gms.location.FusedLocationProviderClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.viewmodel.impl.ViewModelModule;

/**
 * Module that includes app wide dependencies that don't fit into VMs
 *
 * Created by jdvp on 6/11/18.
 */
@Module(
        includes = ViewModelModule.class
)
class AppModule {
    @Provides
    @Singleton
    Context context() {
        return WeatherAppJavaApplication.getApplicationContextInstance();
    }

    @Provides
    @Singleton
    FusedLocationProviderClient fusedLocationProviderClient(Context context) {
        return new FusedLocationProviderClient(context);
    }
}
