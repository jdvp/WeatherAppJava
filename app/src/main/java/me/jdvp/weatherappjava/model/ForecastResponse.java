package me.jdvp.weatherappjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Response type returned by the DarkSkyAPI
 *
 * Created by jdvp on 6/10/18.
 */

public class ForecastResponse {
    @SerializedName("latitude")
    @Expose
    private Double latitude;

    @SerializedName("longitude")
    @Expose
    private Double longitude;

    @SerializedName("timezone")
    @Expose
    private String timezone;

    @SerializedName("currently")
    @Expose
    private Forecast currently;

    @SerializedName("hourly")
    @Expose
    private HourlySummary hourlySummary;

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public Forecast getCurrently() {
        return currently;
    }

    public HourlySummary getHourlySummary() {
        return hourlySummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForecastResponse that = (ForecastResponse) o;

        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null)
            return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null)
            return false;
        if (timezone != null ? !timezone.equals(that.timezone) : that.timezone != null)
            return false;
        if (currently != null ? !currently.equals(that.currently) : that.currently != null)
            return false;
        return hourlySummary != null ? hourlySummary.equals(that.hourlySummary) : that.hourlySummary == null;
    }

    @Override
    public int hashCode() {
        int result = latitude != null ? latitude.hashCode() : 0;
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (currently != null ? currently.hashCode() : 0);
        result = 31 * result + (hourlySummary != null ? hourlySummary.hashCode() : 0);
        return result;
    }
}
