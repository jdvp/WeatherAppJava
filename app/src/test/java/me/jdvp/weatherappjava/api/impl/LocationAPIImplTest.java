package me.jdvp.weatherappjava.api.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;

import com.google.android.gms.location.FusedLocationProviderClient;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;

import io.reactivex.observers.TestObserver;
import me.jdvp.weatherappjava.RxJavaTest;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static junit.framework.Assert.assertEquals;

/**
 * Tests the behavior of the LocationAPIImpl
 *
 * Uses the Robolectric test runner since the tests will fail otherwise because internal android
 * items need to be mocked in ContextCompat for the permissions check
 *
 * Created by jdvp on 6/12/18.
 */

@RunWith(RobolectricTestRunner.class)
public class LocationAPIImplTest extends RxJavaTest {
    private static final double TEST_LATITUDE = 2.72;
    private static final double TEST_LONGITUDE = 3.14;


    private FusedLocationProviderClient fusedLocationProviderClient;
    private Context context;
    private LocationAPIImpl locationAPI;

    @Before
    public void setup() {
        fusedLocationProviderClient = Mockito.mock(FusedLocationProviderClient.class);
        context = Mockito.mock(Context.class);
        locationAPI = new LocationAPIImpl(fusedLocationProviderClient, context);

        //default to allowing location permissions
        Mockito.when(context.checkPermission(Mockito.eq(ACCESS_COARSE_LOCATION), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(PackageManager.PERMISSION_GRANTED);
    }

    @Test
    public void testHasSelectedLocation_False() {
        Mockito.when(context.checkPermission(Mockito.eq(ACCESS_COARSE_LOCATION), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(PackageManager.PERMISSION_DENIED);

        assertEquals(false, locationAPI.hasSelectedLocation());
    }

    @Test
    public void testHasSelectedLocation_EnabledPermissions() {
        assertEquals(true, locationAPI.hasSelectedLocation());
    }

    @Test
    public void testHasSelectedLocation_SelectedLocation() {
        Mockito.when(context.checkPermission(Mockito.eq(ACCESS_COARSE_LOCATION), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(PackageManager.PERMISSION_DENIED);

        locationAPI.setUserSelectedLocation(TEST_LATITUDE, TEST_LONGITUDE);
        assertEquals(true, locationAPI.hasSelectedLocation());
    }

    /**
     * An error will be returned if no location has been manually selected and no permissions are granted
     */
    @Test
    public void testGetLocation_Error() {
        Mockito.when(context.checkPermission(Mockito.eq(ACCESS_COARSE_LOCATION), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(PackageManager.PERMISSION_DENIED);

        TestObserver<Location> testObserver = new TestObserver<>();
        locationAPI.getLocation().subscribe(testObserver);

        testObserver.assertError(Exception.class);
    }

    /**
     * If location permissions are off but the user has selected a location, the user-selected location will
     * be returned
     */
    @Test
    public void testGetLocation_NoPermissionsButUserSelectedLocation(){
        Mockito.when(context.checkPermission(Mockito.eq(ACCESS_COARSE_LOCATION), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(PackageManager.PERMISSION_DENIED);

        //pretend user had set a location
        locationAPI.setUserSelectedLocation(TEST_LATITUDE, TEST_LONGITUDE);


        TestObserver<Location> testObserver = new TestObserver<>();
        locationAPI.getLocation().subscribe(testObserver);

        assertEquals(1, testObserver.valueCount());
        Location location = testObserver.values().get(0);
        assertEquals(TEST_LATITUDE, location.getLatitude());
        assertEquals(TEST_LONGITUDE, location.getLongitude());
    }
}
