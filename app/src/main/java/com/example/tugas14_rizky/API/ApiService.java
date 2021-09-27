package com.example.tugas14_rizky.API;

import com.example.tugas14_rizky.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("getAllContact.php")
    Call<ResponseModel> getAllContact();

    @FormUrlEncoded
    @POST("create.php")
    Call<ResponseModel> insertData(
            @Field("nama") String nama,
            @Field("telepon") String telepon,
            @Field("email") String email

    );
}
