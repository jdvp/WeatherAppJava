package me.jdvp.weatherappjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jdvp on 6/10/18.
 */

public class HourlySummary {

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("data")
    @Expose
    private ArrayList<Forecast> hourlyForecast;

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public ArrayList<Forecast> getHourlyForecast() {
        return hourlyForecast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HourlySummary that = (HourlySummary) o;

        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        return hourlyForecast != null ? hourlyForecast.equals(that.hourlyForecast) : that.hourlyForecast == null;
    }

    @Override
    public int hashCode() {
        int result = summary != null ? summary.hashCode() : 0;
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (hourlyForecast != null ? hourlyForecast.hashCode() : 0);
        return result;
    }
}
