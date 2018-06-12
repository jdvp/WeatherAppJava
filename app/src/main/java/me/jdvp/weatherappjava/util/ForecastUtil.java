package me.jdvp.weatherappjava.util;

import java.util.Calendar;

import me.jdvp.weatherappjava.model.Forecast;

/**
 * Utility used to take forecast data and display it in a helpful way
 *
 * Created by jdvp on 6/10/18.
 */

public class ForecastUtil {

    /**
     * Rounds the temperature since that is what people are used to
     *
     * @param forecast A given forecast
     * @return A string representation of the rounded temperature for the forecast
     */
    public static String getTemperature(Forecast forecast) {
        if (forecast == null || forecast.getTemperature() == null) {
            return "";
        }

        return "" + Math.round(forecast.getTemperature());
    }

    /**
     * Gets the top of the hour for a given forecast
     *
     * @param forecast A given forecast
     * @param calendar A calendar object
     * @return A string representation of the forecast's timestamp in 12 hour time
     */
    public static String getTime(Forecast forecast, Calendar calendar) {
        if (forecast == null || forecast.getTime() == null || calendar == null) {
            return "";
        }

        //DarkSky gives us the time in seconds
        calendar.setTimeInMillis(forecast.getTime()  * 1000);

        int hour = calendar.get(Calendar.HOUR);

        if (hour == 0) {
            hour = 12;
        }
        //todo should localize AM/PM ?
        String amPm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        return hour + " " + amPm;
    }

    /**
     * Gets the chance of precipitation from the given forecast
     *
     * @param forecast A given forecast
     * @return String representation of the chance of precipitation in percent
     * rounded to the nearest whole number
     */
    public static String getPrecipitationProbability(Forecast forecast) {
        if (forecast == null || forecast.getPrecipProbability() == null) {
            return "";
        }

        int probability = (int) (forecast.getPrecipProbability() * 100);
        return probability + "%";
    }
}
