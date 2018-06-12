package me.jdvp.weatherappjava.viewmodel.impl;

import me.jdvp.weatherappjava.api.LocationAPI;
import me.jdvp.weatherappjava.viewmodel.LocationViewModel;

/**
 * Created by jdvp on 6/11/18.
 */

class LocationViewModelImpl implements LocationViewModel {
    private LocationAPI locationAPI;

    LocationViewModelImpl(LocationAPI locationAPI) {
        this.locationAPI = locationAPI;
    }

    @Override
    public void setUserSelectedLocation(double latitude, double longitude) {
        locationAPI.setUserSelectedLocation(latitude, longitude);
    }

    @Override
    public boolean hasSelectedLocation() {
        return locationAPI.hasSelectedLocation();
    }
}
