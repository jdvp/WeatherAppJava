package me.jdvp.weatherappjava.api;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.model.ForecastResponse;

/**
 * Created by jdvp on 6/10/18.
 */

public interface ForecastAPI {
    Observable<ForecastResponse> getForecast(double latitude, double longitude);
}
