package me.jdvp.weatherappjava.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.net.SocketTimeoutException;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.TestWeatherAppJavaApplication;
import me.jdvp.weatherappjava.model.ForecastResponse;
import me.jdvp.weatherappjava.response.ForecastServiceResponses;
import me.jdvp.weatherappjava.viewmodel.ForecastViewModel;

import static junit.framework.Assert.assertEquals;

/**
 * Tests created to test functional requirements that I made up for this project
 *
 * Created by jdvp on 6/10/18.
 */

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Inject
    ForecastViewModel forecastViewModel;

    @Before
    public void setup() {
        TestWeatherAppJavaApplication app = (TestWeatherAppJavaApplication) RuntimeEnvironment.application;
        app.getTestAppComponent().inject(this);
    }

    /**
     * If the forecast service call fails, the error state should be shown.
     *
     * Note: we aren't actually worried about the message displayed
     */
    @Test
    public void testShouldShowErrorIfServiceCallFails() {
        Mockito.when(forecastViewModel.getForecast()).thenReturn(Observable.error(new SocketTimeoutException()));

        MainActivity mainActivity = getResumedActivity();

        assertEquals(View.VISIBLE, mainActivity.findViewById(R.id.error_layout).getVisibility());
        assertEquals(View.GONE, mainActivity.findViewById(R.id.success_layout).getVisibility());
    }

    /**
     * When the service response returns more than 12 hours of data (which is the usually expected),
     * then show at most 12 hours in the forecast
     */
    @Test
    public void testShouldAtMost12HoursAhead() {
        Gson gson = new Gson();
        ForecastResponse response = gson.fromJson(ForecastServiceResponses.SUCCESSFUL_RESPONSE_48_HRS, ForecastResponse.class);
        Mockito.when(forecastViewModel.getForecast()).thenReturn(Observable.just(response));


        MainActivity mainActivity = getResumedActivity();

        assertEquals(View.VISIBLE, mainActivity.findViewById(R.id.success_layout).getVisibility());

        RecyclerView recyclerView = mainActivity.findViewById(R.id.hourly_forecast_recycler_view);
        assertEquals(12, recyclerView.getAdapter().getItemCount());
    }

    /**
     * If for some reason the service returns less than 12 hours of forecasts, show as much as is
     * returned
     */
    @Test
    public void testShouldShowNHoursIfServiceReturnsLessThan12() {
        Gson gson = new Gson();
        ForecastResponse response = gson.fromJson(ForecastServiceResponses.SUCCESSFUL_RESPONSE_6_HRS, ForecastResponse.class);
        Mockito.when(forecastViewModel.getForecast()).thenReturn(Observable.just(response));


        MainActivity mainActivity = getResumedActivity();

        assertEquals(View.VISIBLE, mainActivity.findViewById(R.id.success_layout).getVisibility());

        RecyclerView recyclerView = mainActivity.findViewById(R.id.hourly_forecast_recycler_view);
        assertEquals(6, recyclerView.getAdapter().getItemCount());
    }


    /**
     * Builds the activity under test. Call after setting the mocks appropriately
     *
     * @return A resumed version of MainActivity
     */
    private MainActivity getResumedActivity() {
        return Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();
    }
}
