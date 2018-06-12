package me.jdvp.weatherappjava.viewmodel;

/**
 * View model used to interact with location services
 *
 * Created by jdvp on 6/11/18.
 */

public interface LocationViewModel {
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
