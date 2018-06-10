package me.jdvp.weatherappjava.service;


import java.util.Map;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.model.ForecastResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Interface defining interaction with the Dark Sky API
 *
 * Created by jdvp on 6/10/18.
 */

public interface ForecastService {
    @GET("{id}/{latitude},{longitude}")
    Observable<ForecastResponse> getForecast(
            @Path("id") String id,
            @Path("latitude") double latitude,
            @Path("longitude") double longitude,
            @QueryMap Map<String, String> optionalQueryParameters
    );
}
