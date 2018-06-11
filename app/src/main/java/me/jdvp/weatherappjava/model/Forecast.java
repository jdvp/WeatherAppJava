package me.jdvp.weatherappjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jdvp on 6/10/18.
 */

public class Forecast {
    @SerializedName("time")
    @Expose
    private Long time;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("icon")
    @Expose
    private IconWeatherType iconWeatherType;

    @SerializedName("nearestStormDistance")
    @Expose
    private Integer nearestStormDistance;

    @SerializedName("precipIntensity")
    @Expose
    private Double precipIntensity;

    @SerializedName("precipIntensityError")
    @Expose
    private Double precipIntensityError;

    @SerializedName("precipProbability")
    @Expose
    private Double precipProbability;

    @SerializedName("precipType")
    @Expose
    private String precipType;

    @SerializedName("temperature")
    @Expose
    private Double temperature;

    @SerializedName("apparentTemperature")
    @Expose
    private Double apparentTemperature;

    @SerializedName("dewPoint")
    @Expose
    private Double dewPoint;

    @SerializedName("humidity")
    @Expose
    private Double humidity;

    @SerializedName("pressure")
    @Expose
    private Double pressure;

    @SerializedName("windSpeed")
    @Expose
    private Double windSpeed;

    @SerializedName("windGust")
    @Expose
    private Double windGust;

    @SerializedName("windBearing")
    @Expose
    private Integer windBearing;

    @SerializedName("cloudCover")
    @Expose
    private Double cloudCover;

    @SerializedName("uvIndex")
    @Expose
    private Integer uvIndex;

    @SerializedName("visibility")
    @Expose
    private Double visibility;

    @SerializedName("ozone")
    @Expose
    private Double ozone;

    public Long getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }


    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public Double getPrecipIntensityError() {
        return precipIntensityError;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public Double getTemperature() {
        return temperature;
    }

    public IconWeatherType getIconWeatherType() {
        return iconWeatherType;
    }

    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Double getWindGust() {
        return windGust;
    }

    public Integer getWindBearing() {
        return windBearing;
    }

    public Double getCloudCover() {
        return cloudCover;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public Double getVisibility() {
        return visibility;
    }

    public Double getOzone() {
        return ozone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forecast forecast = (Forecast) o;

        if (time != null ? !time.equals(forecast.time) : forecast.time != null) return false;
        if (summary != null ? !summary.equals(forecast.summary) : forecast.summary != null)
            return false;
        if (iconWeatherType != forecast.iconWeatherType) return false;
        if (nearestStormDistance != null ? !nearestStormDistance.equals(forecast.nearestStormDistance) : forecast.nearestStormDistance != null)
            return false;
        if (precipIntensity != null ? !precipIntensity.equals(forecast.precipIntensity) : forecast.precipIntensity != null)
            return false;
        if (precipIntensityError != null ? !precipIntensityError.equals(forecast.precipIntensityError) : forecast.precipIntensityError != null)
            return false;
        if (precipProbability != null ? !precipProbability.equals(forecast.precipProbability) : forecast.precipProbability != null)
            return false;
        if (precipType != null ? !precipType.equals(forecast.precipType) : forecast.precipType != null)
            return false;
        if (temperature != null ? !temperature.equals(forecast.temperature) : forecast.temperature != null)
            return false;
        if (apparentTemperature != null ? !apparentTemperature.equals(forecast.apparentTemperature) : forecast.apparentTemperature != null)
            return false;
        if (dewPoint != null ? !dewPoint.equals(forecast.dewPoint) : forecast.dewPoint != null)
            return false;
        if (humidity != null ? !humidity.equals(forecast.humidity) : forecast.humidity != null)
            return false;
        if (pressure != null ? !pressure.equals(forecast.pressure) : forecast.pressure != null)
            return false;
        if (windSpeed != null ? !windSpeed.equals(forecast.windSpeed) : forecast.windSpeed != null)
            return false;
        if (windGust != null ? !windGust.equals(forecast.windGust) : forecast.windGust != null)
            return false;
        if (windBearing != null ? !windBearing.equals(forecast.windBearing) : forecast.windBearing != null)
            return false;
        if (cloudCover != null ? !cloudCover.equals(forecast.cloudCover) : forecast.cloudCover != null)
            return false;
        if (uvIndex != null ? !uvIndex.equals(forecast.uvIndex) : forecast.uvIndex != null)
            return false;
        if (visibility != null ? !visibility.equals(forecast.visibility) : forecast.visibility != null)
            return false;
        return ozone != null ? ozone.equals(forecast.ozone) : forecast.ozone == null;
    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (iconWeatherType != null ? iconWeatherType.hashCode() : 0);
        result = 31 * result + (nearestStormDistance != null ? nearestStormDistance.hashCode() : 0);
        result = 31 * result + (precipIntensity != null ? precipIntensity.hashCode() : 0);
        result = 31 * result + (precipIntensityError != null ? precipIntensityError.hashCode() : 0);
        result = 31 * result + (precipProbability != null ? precipProbability.hashCode() : 0);
        result = 31 * result + (precipType != null ? precipType.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (apparentTemperature != null ? apparentTemperature.hashCode() : 0);
        result = 31 * result + (dewPoint != null ? dewPoint.hashCode() : 0);
        result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
        result = 31 * result + (pressure != null ? pressure.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        result = 31 * result + (windGust != null ? windGust.hashCode() : 0);
        result = 31 * result + (windBearing != null ? windBearing.hashCode() : 0);
        result = 31 * result + (cloudCover != null ? cloudCover.hashCode() : 0);
        result = 31 * result + (uvIndex != null ? uvIndex.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (ozone != null ? ozone.hashCode() : 0);
        return result;
    }
}
