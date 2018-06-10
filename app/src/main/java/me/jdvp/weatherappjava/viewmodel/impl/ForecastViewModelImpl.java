package me.jdvp.weatherappjava.viewmodel.impl;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.model.ForecastResponse;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;
import me.jdvp.weatherappjava.viewmodel.RxTransform;

/**
 * Created by jdvp on 6/10/18.
 */

class ForecastViewModelImpl implements ForecastViewModel {
    private ForecastAPI forecastAPI;

    ForecastViewModelImpl(ForecastAPI forecastAPI) {
        this.forecastAPI = forecastAPI;
    }

    @Override
    public Observable<ForecastResponse> getForecast() {
        //todo get user's location
        return forecastAPI.getForecast(40.1089630,-82.9605226)
                .compose(RxTransform.ui());
    }
}
