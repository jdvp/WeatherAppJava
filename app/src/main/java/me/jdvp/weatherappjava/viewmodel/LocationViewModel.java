package me.jdvp.weatherappjava.viewmodel;

/**
 * Created by jdvp on 6/11/18.
 */

public interface LocationViewModel {
    void setUserSelectedLocation(double latitude, double longitude);

    boolean hasSelectedLocation();
}
