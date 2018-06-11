package me.jdvp.weatherappjava.viewmodel.impl;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.api.LocationAPI;
import me.jdvp.weatherappjava.model.ForecastResponse;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;
import me.jdvp.weatherappjava.viewmodel.RxTransform;

/**
 * Created by jdvp on 6/10/18.
 */

class ForecastViewModelImpl implements ForecastViewModel {
    private LocationAPI locationAPI;
    private ForecastAPI forecastAPI;

    ForecastViewModelImpl(ForecastAPI forecastAPI, LocationAPI locationAPI) {
        this.forecastAPI = forecastAPI;
        this.locationAPI = locationAPI;
    }

    @Override
    public Observable<ForecastResponse> getForecast() {
        return locationAPI.getLocation().observeOn(Schedulers.io()).flatMap(
                location -> forecastAPI.getForecast(location.getLatitude(), location.getLongitude())
        ).compose(RxTransform.ui());
    }
}
