package com.example.testapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIHelper {

    private static Retrofit retrofit = null;

    public static API getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(API.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        API api = retrofit.create(API.class);
        return api;
    }

}
