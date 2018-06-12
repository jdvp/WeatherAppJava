package me.jdvp.weatherappjava.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;

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

    @Inject
    LocationViewModel locationViewModel;

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

    public void updateBasedOnLocationSettings() {
        if (locationViewModel.hasSelectedLocation()) {
            //make service call etc
            initFragment(new ForecastFragment());
        } else {
            initFragment(new LocationSelectionFragment());
        }
    }

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

    private void getPermissions() {
        if (!hasLocationPermissions()) {
            ActivityCompat.requestPermissions(this, new String[]{ACCESS_COARSE_LOCATION}, REQUEST_CODE_COARSE_LOCATION);
        }
    }

    private boolean hasLocationPermissions() {
        int permissionCheck = ContextCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION);
        return permissionCheck == PERMISSION_GRANTED;
    }
}
