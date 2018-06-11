package me.jdvp.weatherappjava.util;

import java.util.Calendar;

import me.jdvp.weatherappjava.model.Forecast;

/**
 * Created by jdvp on 6/10/18.
 */

public class ForecastUtil {

    public static long getTemperature(Forecast forecast) {
        if (forecast == null || forecast.getTemperature() == null) {
            return 0L;
        }

        return Math.round(forecast.getTemperature());
    }

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
}
