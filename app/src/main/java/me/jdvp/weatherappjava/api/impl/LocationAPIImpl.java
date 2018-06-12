package me.jdvp.weatherappjava.api.impl;

import android.content.Context;
import android.location.Location;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.api.LocationAPI;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;

/**
 * Created by jdvp on 6/11/18.
 */

public class LocationAPIImpl implements LocationAPI {
    private FusedLocationProviderClient fusedLocationProviderClient;
    private Context context;

    private Double userSelectedLatitude;
    private Double userSelectedLongitude;

    LocationAPIImpl(FusedLocationProviderClient fusedLocationProviderClient, Context context) {
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        this.context = context;
    }

    @Override
    public Observable<Location> getLocation() {
        int permissionCheck = ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION);
        boolean hasLocationPermissions = permissionCheck == PERMISSION_GRANTED;
        boolean userHasSelectedLocation = userHasSelectedLocation();

        //if the user has not selected a location and does not have permissions enabled, then send back an error
        if (!hasLocationPermissions && !userHasSelectedLocation) {
            return Observable.error(new Exception("location is not permitted"));

        //prioritize actual location if permissions are on
        } else if (hasLocationPermissions) {
            return Observable.create(emitter -> fusedLocationProviderClient.getLastLocation()
                    .addOnSuccessListener(location -> {
                        if (location == null) {
                            emitter.onError(new Exception("location is null"));
                        }
                        emitter.onNext(location);
                        emitter.onComplete();
                    }));
        //otherwise, fall back to using the user-selected location
        } else {
            Location location = new Location("");
            location.setLatitude(userSelectedLatitude);
            location.setLongitude(userSelectedLongitude);
            return Observable.just(location);
        }
    }


    private boolean userHasSelectedLocation() {
        return userSelectedLatitude != null && userSelectedLongitude != null;
    }

    @Override
    public void setUserSelectedLocation(double latitude, double longitude) {
        userSelectedLatitude = latitude;
        userSelectedLongitude = longitude;
    }

    @Override
    public boolean hasSelectedLocation() {
        int permissionCheck = ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION);
        boolean hasLocationPermissions = permissionCheck == PERMISSION_GRANTED;
        boolean userHasSelectedLocation = userHasSelectedLocation();

        return hasLocationPermissions || userHasSelectedLocation;
    }
}
