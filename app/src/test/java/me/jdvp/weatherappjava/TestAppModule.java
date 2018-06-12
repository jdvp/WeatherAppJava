package me.jdvp.weatherappjava;

import android.content.Context;
import android.location.Geocoder;

import com.google.android.gms.location.FusedLocationProviderClient;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.weatherappjava.viewmodel.impl.TestViewModelModule;

/**
 * Test module that mirrors app module but mocks the dependencies
 *
 * Created by jdvp on 6/11/18.
 */
@Module(
        includes = TestViewModelModule.class
)
class TestAppModule {
    @Provides
    @Singleton
    Context context() {
        return Mockito.mock(Context.class);
    }

    @Provides
    @Singleton
    FusedLocationProviderClient fusedLocationProviderClient() {
        return Mockito.mock(FusedLocationProviderClient.class);
    }

    @Provides
    @Singleton
    Geocoder geocoder() {
        return Mockito.mock(Geocoder.class);
    }
}
