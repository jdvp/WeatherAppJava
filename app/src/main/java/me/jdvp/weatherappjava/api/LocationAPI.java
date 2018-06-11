package me.jdvp.weatherappjava.api;

import android.location.Location;

import io.reactivex.Observable;


/**
 * Created by jdvp on 6/11/18.
 */

public interface LocationAPI {
    Observable<Location> getLocation();
}
