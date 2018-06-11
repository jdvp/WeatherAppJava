package me.jdvp.weatherappjava.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.disposables.CompositeDisposable;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.adapter.HourlyForecastAdapter;
import me.jdvp.weatherappjava.model.ForecastResponse;
import me.jdvp.weatherappjava.util.ForecastUtil;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class MainActivity extends DaggerAppCompatActivity {
    private final int REQUEST_CODE_COARSE_LOCATION = 1;

    @BindView(R.id.current_weather_image_view)
    ImageView currentWeatherImageView;

    @BindView(R.id.current_weather_text_view)
    TextView currentWeatherTextView;

    @BindView(R.id.current_temperature_text_view)
    TextView currentTemperatureTextView;

    @BindView(R.id.hourly_forecast_recycler_view)
    RecyclerView hourlyForecastRecyclerView;

    @BindView(R.id.success_layout)
    View successLayout;

    @BindView(R.id.error_layout)
    View errorLayout;

    @BindView(R.id.error_message_text_view)
    TextView errorMessageTextView;

    @Inject
    ForecastViewModel forecastViewModel;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        hourlyForecastRecyclerView.setLayoutManager(layoutManager);

        getPermissions();
    }

    @Override
    public void onResume() {
        super.onResume();
        /*


        if (ContextCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION) == PERMISSION_GRANTED) {

        } */
        updateBasedOnLocationSettings();
    }

    private void updateBasedOnLocationSettings() {
        if (hasLocationPermissions()) {
            //make service call etc
            compositeDisposable.add(forecastViewModel.getForecast().subscribe(
                    this::displayForecast,
                    throwable -> showError(getString(R.string.error_message_service_failure))
            ));
        } else {
            showError("NO LOCATION PERMISSIONS");
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

    private void displayForecast(ForecastResponse forecastResponse) {
        successLayout.setVisibility(View.VISIBLE);
        errorLayout.setVisibility(View.GONE);

        currentTemperatureTextView.setText(ForecastUtil.getTemperature(forecastResponse.getCurrently()));
        currentWeatherTextView.setText(forecastResponse.getCurrently().getSummary());

        //todo icon

        hourlyForecastRecyclerView.setAdapter(new HourlyForecastAdapter(forecastResponse.getHourlySummary().getHourlyForecast()));
    }

    private void showError(@NonNull String errorMessage) {
        successLayout.setVisibility(View.GONE);
        errorLayout.setVisibility(View.VISIBLE);
        errorMessageTextView.setText(errorMessage);
    }
}
