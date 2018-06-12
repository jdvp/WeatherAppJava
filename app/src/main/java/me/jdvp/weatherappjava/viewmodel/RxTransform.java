package me.jdvp.weatherappjava.viewmodel;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class RxTransform {

    /**
     * Schedules an Observable to be observed on the main thread
     * @param <T> The value type
     * @return The same observable but being observed on the main thread
     */
    public static <T> ObservableTransformer<T, T> ui() {
        return tObservable -> tObservable.observeOn(AndroidSchedulers.mainThread());
    }
}
