package me.jdvp.weatherappjava.api.impl;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.BuildConfig;
import me.jdvp.weatherappjava.api.ForecastAPI;
import me.jdvp.weatherappjava.model.ForecastResponse;
import me.jdvp.weatherappjava.service.ForecastService;

/**
 * Created by jdvp on 6/10/18.
 */

class ForecastAPIImpl implements ForecastAPI {
    private ForecastService forecastService;

    ForecastAPIImpl(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @Override
    public Observable<ForecastResponse> getForecast(double latitude, double longitude) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put("excludes", "minutely,daily,alerts,flags");
        queryParameters.put("units", "auto");

        return forecastService.getForecast(BuildConfig.DarkSkyAPIKey, latitude, longitude, queryParameters);
    }
}
