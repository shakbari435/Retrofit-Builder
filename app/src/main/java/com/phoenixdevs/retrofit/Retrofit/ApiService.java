package com.phoenixdevs.retrofit.Retrofit;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/api/v1/getUsers")
    Call<ArrayList<Users>> getUsers(
               ///www.phoenixdevs.ir/api/v1/getname?id=----
    );



    @POST("/api/v1/setuser")
    @FormUrlEncoded
    Call<Users> setUser(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);



    @GET("/api/v1/user/{id}")    // www.phoenixdevs.ir/api/v1/2?api_key=123123123
    Call<Users> getUserDetails(@Path("id") int id, @Query("api_key") String apiKey);



    @DELETE("/api/v1/deleteuser/{id}")
    Call<String> deletePost(@Path("id") long id);



}
