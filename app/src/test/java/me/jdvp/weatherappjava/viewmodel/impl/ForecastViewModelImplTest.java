package me.jdvp.weatherappjava.viewmodel.impl;

import android.location.Location;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketTimeoutException;

import io.reactivex.Observable;
import io.reactivex.observers.TestObserver;
import me.jdvp.weatherappjava.RxJavaTest;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.api.LocationAPI;
import me.jdvp.weatherappjava.model.ForecastResponse;

/**
 * Used to test the concrete implementation of ForecastViewModel
 *
 * Test has few cases since the view model layer is basically a pass-through in this case
 *
 * Created by jdvp on 6/10/18.
 */
@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class ForecastViewModelImplTest extends RxJavaTest {
    private ForecastAPI forecastAPI;
    private LocationAPI locationAPI;
    private ForecastViewModelImpl forecastViewModel;

    @Before
    public void setup() {
        forecastAPI = Mockito.mock(ForecastAPI.class);
        locationAPI = Mockito.mock(LocationAPI.class);
        forecastViewModel = new ForecastViewModelImpl(forecastAPI, locationAPI);

        //default to location api success
        Location location = Mockito.mock(Location.class);
        Mockito.when(location.getLatitude()).thenReturn(1.2);
        Mockito.when(location.getLongitude()).thenReturn(1.2);
        Mockito.when(locationAPI.getLocation()).thenReturn(Observable.just(location));
    }

    @Test
    public void testGetForecast_LocationError() {
        Mockito.when(locationAPI.getLocation()).thenReturn(Observable.error(new SocketTimeoutException()));

        TestObserver<ForecastResponse> testObserver = new TestObserver<>();
        forecastViewModel.getForecast().subscribe(testObserver);

        testObserver.assertError(SocketTimeoutException.class);
    }

    @Test
    public void testGetForecast_LocationSuccessServiceError() {
        Mockito.when(forecastAPI.getForecast(Mockito.anyDouble(), Mockito.anyDouble()))
                .thenReturn(Observable.error(new SocketTimeoutException()));

        TestObserver<ForecastResponse> testObserver = new TestObserver<>();
        forecastViewModel.getForecast().subscribe(testObserver);

        testObserver.assertError(SocketTimeoutException.class);
    }

    @Test
    public void testGetForecast_LocationSuccessServiceSuccess() {
        ForecastResponse forecastResponse = Mockito.mock(ForecastResponse.class);

        Mockito.when(forecastAPI.getForecast(Mockito.anyDouble(), Mockito.anyDouble()))
                .thenReturn(Observable.just(forecastResponse));


        TestObserver<ForecastResponse> testObserver = new TestObserver<>();
        forecastViewModel.getForecast().subscribe(testObserver);

        testObserver.awaitTerminalEvent();
        testObserver.assertValue(forecastResponse);
        testObserver.assertComplete();
    }
}
