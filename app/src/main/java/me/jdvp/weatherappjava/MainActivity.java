package me.jdvp.weatherappjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.current_weather_image_view)
    ImageView currentWeatherImageView;

    @BindView(R.id.current_weather_text_view)
    TextView currentWeatherTextView;

    @BindView(R.id.current_temperature_text_view)
    TextView currentTemperatureTextView;

    @BindView(R.id.hourly_forecast_recycler_view)
    RecyclerView hourlyForecastRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
