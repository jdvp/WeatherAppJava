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

    LocationAPIImpl(FusedLocationProviderClient fusedLocationProviderClient, Context context) {
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        this.context = context;
    }

    @Override
    public Observable<Location> getLocation() {

        int permissionCheck = ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION);
        if (!(permissionCheck == PERMISSION_GRANTED)) {
            return Observable.error(new Exception("location is not permitted"));
        }

        return Observable.create(emitter -> fusedLocationProviderClient.getLastLocation()
                .addOnSuccessListener(location -> {
                    if (location == null) {
                        emitter.onError(new Exception("location is null"));
                    }
                    emitter.onNext(location);
                    emitter.onComplete();
                }));
    }
}
