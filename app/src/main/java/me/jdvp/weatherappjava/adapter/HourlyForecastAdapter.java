package me.jdvp.weatherappjava.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.model.Forecast;
import me.jdvp.weatherappjava.util.ForecastUtil;

/**
 * Created by jdvp on 6/10/18.
 */

public class HourlyForecastAdapter extends RecyclerView.Adapter<HourlyForecastAdapter.ViewHolder> {
    private List<Forecast> forecastList;

    public HourlyForecastAdapter(@NonNull List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_recycler_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.timeTextView.setText(ForecastUtil.getTime(forecastList.get(position), Calendar.getInstance()));
        holder.temperatureTextView.setText(Long.toString(ForecastUtil.getTemperature(forecastList.get(position))));
    }

    @Override
    public int getItemCount() {
        //show 12 hours ahead at most
        return Math.min(12, forecastList.size());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.hourly_recycler_item_time_text_view)
        TextView timeTextView;

        @BindView(R.id.hourly_recycler_item_temperature_text_view)
        TextView temperatureTextView;

        @BindView(R.id.hourly_recycler_item_precipitation_text_view)
        TextView precipitationTextView;

        @BindView(R.id.hourly_recycler_item_weather_icon_image_view)
        ImageView iconImageView;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
