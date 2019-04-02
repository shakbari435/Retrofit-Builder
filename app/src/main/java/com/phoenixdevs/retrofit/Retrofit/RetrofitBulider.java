package com.phoenixdevs.retrofit.Retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBulider {


    public static final String BASE_URL = "https://www.phoenixdevs.ir";
    public static Retrofit myRetrofit = null;

    private static Retrofit getClient() {



        if (myRetrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build();

            myRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();

        }

        return myRetrofit;
    }



    public static ApiService getApiService() {
        if (myRetrofit == null) getClient();
        return myRetrofit.create(ApiService.class);
    }




}
