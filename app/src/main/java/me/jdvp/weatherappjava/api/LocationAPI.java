package me.jdvp.weatherappjava.api;

import android.location.Location;

import io.reactivex.Observable;


/**
 * Created by jdvp on 6/11/18.
 */

public interface LocationAPI {
    /**
     * Gets the currently selected location based on permissions and user searching
     * @return
     */
    Observable<Location> getLocation();

    /**
     * Sets a location if the user has turned off or denied location permissions but still wants
     * to see weather information
     *
     * @param latitude The user selected latitude
     * @param longitude The user selected longitude
     */
    void setUserSelectedLocation(double latitude, double longitude);

    /**
     * Returns whether or not the app is ready to make a forecast call
     * @return
     */
    boolean hasSelectedLocation();
}
