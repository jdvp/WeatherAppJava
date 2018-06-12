package me.jdvp.weatherappjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Weather icon for displaying visual representation of the current weather conditions
 *
 * Created by jdvp on 6/10/18.
 */

public enum IconWeatherType {
    @SerializedName("clear-day")
    @Expose
    CLEAR_DAY,

    @SerializedName("clear-night")
    @Expose
    CLEAR_NIGHT,

    @SerializedName("rain")
    @Expose
    RAIN,

    @SerializedName("snow")
    @Expose
    SNOW,

    @SerializedName("sleet")
    @Expose
    SLEET,

    @SerializedName("wind")
    @Expose
    WIND,

    @SerializedName("fog")
    @Expose
    FOG,

    @SerializedName("cloudy")
    @Expose
    CLOUDY,

    @SerializedName("partly-cloudy-day")
    @Expose
    PARTLY_CLOUDY_DAY,

    @SerializedName("partly-cloudy-night")
    @Expose
    PARTLY_CLOUDY_NIGHT;
}
