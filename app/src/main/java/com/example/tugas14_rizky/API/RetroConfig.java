package com.example.tugas14_rizky.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroConfig {
    private static final String BASE_URL = "http://10.0.2.2/ContactManagement/";
    private static Retrofit retro;

    public static Retrofit retrofitConnect(){
        if(retro == null){
            retro = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retro;
    }
}
