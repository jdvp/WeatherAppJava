package me.jdvp.weatherappjava.viewmodel.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import me.jdvp.weatherappjava.api.LocationAPI;

import static junit.framework.Assert.assertEquals;

/**
 * Tests the LocationViewModelImpl.
 *
 * These tests are very simple since this view model is basically a pass-through to the API layer
 *
 * Created by jdvp on 6/12/18.
 */

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class LocationViewModelImplTest {
    private LocationAPI locationAPI;
    private LocationViewModelImpl locationViewModel;

    @Before
    public void setup() {
        locationAPI = Mockito.mock(LocationAPI.class);
        locationViewModel = new LocationViewModelImpl(locationAPI);
    }

    @Test
    public void testSetUserSelectedLocation() {
        double latitude = 1.1222;
        double longitude = 7.2133;

        //should call straight down to the api level
        locationViewModel.setUserSelectedLocation(latitude, longitude);
        Mockito.verify(locationAPI, Mockito.times(1)).setUserSelectedLocation(Mockito.eq(latitude), Mockito.eq(longitude));
    }

    @Test
    public void testHasSelectedLocation_False() {
        Mockito.when(locationAPI.hasSelectedLocation()).thenReturn(false);
        assertEquals(false, locationViewModel.hasSelectedLocation());
    }


    @Test
    public void testHasSelectedLocation_True() {
        Mockito.when(locationAPI.hasSelectedLocation()).thenReturn(true);
        assertEquals(true, locationViewModel.hasSelectedLocation());
    }
}
