package me.jdvp.weatherappjava.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Calendar;

import me.jdvp.weatherappjava.model.Forecast;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

/**
 * Created by jdvp on 6/10/18.
 */

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class ForecastUtilTest {
    @Test
    public void testGetTemperature_NullForecast() {
        assertEquals(0L, ForecastUtil.getTemperature(null));
    }

    @Test
    public void testGetTemperature_NullTemperature() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTemperature()).thenReturn(null);

        assertEquals(0L, ForecastUtil.getTemperature(mockForecast));
    }

    @Test
    public void testGetTemperature_RoundUp() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTemperature()).thenReturn(32.50);

        assertEquals(33L, ForecastUtil.getTemperature(mockForecast));
    }

    @Test
    public void testGetTemperature_RoundDown() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTemperature()).thenReturn(32.49);

        assertEquals(32L, ForecastUtil.getTemperature(mockForecast));
    }

    @Test
    public void testGetTime_NullForecast() {
        assertEquals("", ForecastUtil.getTime(null, Mockito.mock(Calendar.class)));
    }

    @Test
    public void testGetTime_NullCalendar() {
        Forecast mockForecast = Mockito.mock(Forecast.class);

        assertEquals("", ForecastUtil.getTime(mockForecast, null));
    }

    @Test
    public void testGetTime_NullTime() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTime()).thenReturn(null);

        Calendar mockCalendar = Mockito.mock(Calendar.class);

        assertEquals("", ForecastUtil.getTime(mockForecast, mockCalendar));
    }

    @Test
    public void testGetTime_AM() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTime()).thenReturn(0L);

        Calendar mockCalendar = Mockito.mock(Calendar.class);

        Mockito.when(mockCalendar.get(anyInt())).thenAnswer(invocation -> {
            int arg = invocation.getArgument(0);
            switch (arg) {
                case Calendar.AM_PM:
                    return Calendar.AM;
                case Calendar.HOUR:
                    return 10;
            }
            return -1;
        });

        //time should equal what is expected based on mocked return values
        assertEquals("10 AM", ForecastUtil.getTime(mockForecast, mockCalendar));

        //calendar time should have been set during the test
        Mockito.verify(mockCalendar, Mockito.times(1)).setTimeInMillis(Mockito.anyLong());
    }

    @Test
    public void testGetTime_PM() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTime()).thenReturn(0L);

        Calendar mockCalendar = Mockito.mock(Calendar.class);

        Mockito.when(mockCalendar.get(anyInt())).thenAnswer(invocation -> {
            int arg = invocation.getArgument(0);
            switch (arg) {
                case Calendar.AM_PM:
                    return Calendar.PM;
                case Calendar.HOUR:
                    return 10;
            }
            return -1;
        });
        //time should equal what is expected based on mocked return values
        assertEquals("10 PM", ForecastUtil.getTime(mockForecast, mockCalendar));

        //calendar time should have been set during the test
        Mockito.verify(mockCalendar, Mockito.times(1)).setTimeInMillis(Mockito.anyLong());
    }

    @Test
    public void testGetTime_12() {
        Forecast mockForecast = Mockito.mock(Forecast.class);
        Mockito.when(mockForecast.getTime()).thenReturn(0L);

        Calendar mockCalendar = Mockito.mock(Calendar.class);

        Mockito.when(mockCalendar.get(anyInt())).thenAnswer(invocation -> {
            int arg = invocation.getArgument(0);
            switch (arg) {
                case Calendar.AM_PM:
                    return Calendar.PM;
                case Calendar.HOUR:
                    return 0;
            }
            return -1;
        });

        //time should equal what is expected based on mocked return values
        assertEquals("12 PM", ForecastUtil.getTime(mockForecast, mockCalendar));

        //calendar time should have been set during the test
        Mockito.verify(mockCalendar, Mockito.times(1)).setTimeInMillis(Mockito.anyLong());
    }
}
