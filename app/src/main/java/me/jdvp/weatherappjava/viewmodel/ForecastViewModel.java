package me.jdvp.weatherappjava.viewmodel;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.model.ForecastResponse;

/**
 * Created by jdvp on 6/10/18.
 */

public interface ForecastViewModel {
    Observable<ForecastResponse> getForecast();
}
