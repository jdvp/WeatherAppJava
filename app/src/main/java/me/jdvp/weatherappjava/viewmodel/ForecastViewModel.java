package me.jdvp.weatherappjava.viewmodel;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.model.ForecastResponse;

/**
 * View model used to interact with weather data
 *
 * Created by jdvp on 6/10/18.
 */

public interface ForecastViewModel {
    /**
     * Retrieves forecast information
     *
     * @return an Observable with either an error or the forecast response
     */
    Observable<ForecastResponse> getForecast();
}
