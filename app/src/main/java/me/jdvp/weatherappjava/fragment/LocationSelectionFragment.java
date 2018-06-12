package me.jdvp.weatherappjava.fragment;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.jakewharton.rxbinding2.widget.RxTextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import me.jdvp.weatherappjava.R;
import me.jdvp.weatherappjava.activity.MainActivity;
import me.jdvp.weatherappjava.viewmodel.LocationViewModel;

/**
 * Created by jdvp on 6/11/18.
 */

public class LocationSelectionFragment extends DaggerFragment {

    @BindView(R.id.location_search_edit_text)
    EditText locationSearchEditText;

    @Inject
    LocationViewModel locationViewModel;

    @Inject
    Geocoder geocoder;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_location_selection, container, false);
        ButterKnife.bind(this, contentView);
        return contentView;
    }

    @Override
    public void onResume() {
        super.onResume();

        compositeDisposable.add(RxTextView.textChanges(locationSearchEditText)
                .filter(charSequence -> charSequence.length() == 5)
                .flatMap(charSequence ->
                        Observable.fromIterable(geocoder.getFromLocationName(charSequence.toString(), 1))
                        .take(1)
                ).onErrorResumeNext((ObservableSource<? extends Address>) throwable -> Observable.empty())
                .subscribe(address -> {
                            locationViewModel.setUserSelectedLocation(address.getLatitude(), address.getLongitude());
                            //todo figure this out
                            if (getActivity() != null && getActivity() instanceof MainActivity) {
                                ((MainActivity) getActivity()).updateBasedOnLocationSettings();
                            }
                        }
                ));
    }
}
