package me.jdvp.weatherappjava.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Utility class used to create retrofit service classes
 *
 * Created by jdvp on 6/10/18.
 */

public class ServiceCreator {
    public static <T> T create (Class<T> service) {
        //logging
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder().addInterceptor(logging);

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(httpClientBuilder.build());
        builder.baseUrl(" https://api.darksky.net/forecast/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        return builder.build().create(service);
    }
}
