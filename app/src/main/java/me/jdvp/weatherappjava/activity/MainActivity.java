package me.jdvp.weatherappjava.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;

public class MainActivity extends DaggerAppCompatActivity {

    @BindView(R.id.current_weather_image_view)
    ImageView currentWeatherImageView;

    @BindView(R.id.current_weather_text_view)
    TextView currentWeatherTextView;

    @BindView(R.id.current_temperature_text_view)
    TextView currentTemperatureTextView;

    @BindView(R.id.hourly_forecast_recycler_view)
    RecyclerView hourlyForecastRecyclerView;

    @Inject
    ForecastViewModel forecastViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        forecastViewModel.getForecast().subscribe();
    }
}
