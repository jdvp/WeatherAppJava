package me.jdvp.weatherappjava.api;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.model.ForecastResponse;

public interface ForecastAPI {
    /**
     * Retrieves weather data based on the given location data
     *
     * @param latitude Latitude to retrieve weather data
     * @param longitude Longitude to retrieve weather data
     * @return
     */
    Observable<ForecastResponse> getForecast(double latitude, double longitude);
}
