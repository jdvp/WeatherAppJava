package me.jdvp.weatherappjava.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.fragment.ForecastFragment;
import me.jdvp.weatherappjava.fragment.LocationSelectionFragment;
import me.jdvp.weatherappjava.viewmodel.LocationViewModel;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class MainActivity extends DaggerAppCompatActivity {
    private final int REQUEST_CODE_COARSE_LOCATION = 1;
    private final int PLACE_PICKER_REQUEST = 2;

    @Inject
    LocationViewModel locationViewModel;

    @Inject
    Context context;

    private AlertDialog currentlyDisplayedAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getPermissions();
    }

    @Override
    public void onResume() {
        super.onResume();
        updateBasedOnLocationSettings();
    }

    /**
     * Checks whether the user has given location permissions or selected a location and displays
     * the current weather and forecast if possible. Otherwise, the user is prompted to give permissions
     * or enter a place for which they want to check weather conditions
     */
    public void updateBasedOnLocationSettings() {
        if (currentlyDisplayedAlert != null && currentlyDisplayedAlert.isShowing()) {
            currentlyDisplayedAlert.dismiss();
            currentlyDisplayedAlert = null;
        }

        //if the app knows the location to display weather for, display weather information
        if (locationViewModel.hasSelectedLocation()) {
            initFragment(new ForecastFragment());
        //otherwise give the user a few options for selecting a location
        } else {
            currentlyDisplayedAlert = new AlertDialog.Builder(this)
                    .setMessage(R.string.no_location_dialog_message)
                    .setCancelable(false)
                    .setPositiveButton(R.string.no_location_dialog_option_turn_on_permissions, (dialog, which) -> openApplicationSettings())
                    .setNegativeButton(R.string.no_location_dialog_option_select_location, (dialog, which) -> openLocationSelection())
                    .show();
        }
    }

    /**
     * Allows the user to manually select a location. If possible, the user will be taken to the
     * Google Places Picker to pick a location. Otherwise, a custom screen will be shown in which the
     * user can enter a zip code
     */
    private void openLocationSelection() {
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

        try {
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
            //there is a google play services error, so we will just display our own zip code selection screen
            //in the future, we could just the error type and augment this behavior (e.g. if services just need to be updated)
            initFragment(new LocationSelectionFragment());
        }
    }

    /**
     * Opens the WeatherAppJava settings page so that users can turn on location permissions
     */
    private void openApplicationSettings() {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {
                Place place = PlacePicker.getPlace(this, data);
                if (place != null && place.getLatLng() != null) {
                    locationViewModel.setUserSelectedLocation(place.getLatLng().latitude, place.getLatLng().longitude);
                    updateBasedOnLocationSettings();
                    return;
                }
            }
            //either the place was null or the result was not RESULT_OK
            initFragment(new LocationSelectionFragment());
        }
    }

    /**
     * Displays the provided fragment if an instance of the fragment's class is not already visible
     *
     * @param fragment The fragment to display
     */
    private void initFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment alreadyDisplayedFragmentOfSameType = fragmentManager.findFragmentByTag(fragment.getClass().getSimpleName());
        if (alreadyDisplayedFragmentOfSameType == null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName())
                    .commit();
        } else if (!alreadyDisplayedFragmentOfSameType.isVisible()) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, alreadyDisplayedFragmentOfSameType, fragment.getClass().getSimpleName())
                    .commit();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int grantResults[]) {
        switch (requestCode) {
            case REQUEST_CODE_COARSE_LOCATION:
                updateBasedOnLocationSettings();
                break;
        }
    }

    /**
     * Requests location permissions if they have not yet been granted
     */
    private void getPermissions() {
        if (!hasLocationPermissions()) {
            ActivityCompat.requestPermissions(this, new String[]{ACCESS_COARSE_LOCATION}, REQUEST_CODE_COARSE_LOCATION);
        }
    }

    /**
     * Checks to see if the app has been granted the coarse location permission
     *
     * @return boolean denoting whether the permission has been granted
     */
    private boolean hasLocationPermissions() {
        int permissionCheck = ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION);
        return permissionCheck == PERMISSION_GRANTED;
    }
}
