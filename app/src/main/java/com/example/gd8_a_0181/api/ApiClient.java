package com.example.gd8_a_0181.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://pbp-web-api.herokuapp.com/api/"; public static Retrofit retrofit = null;
    public static Retrofit getClient() { if (retrofit == null) {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

        return retrofit;
    }
}