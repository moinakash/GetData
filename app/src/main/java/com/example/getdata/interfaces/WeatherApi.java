package com.example.getdata.interfaces;

import com.example.getdata.modelclasses.MainArray;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface WeatherApi {

    @GET("gadget/search")
    Call<MainArray> getdata(@Query("sector_id") int sectorid,
                               @Query("gadget_year") int year);


    @GET("gadget")
    Call<MainArray> get_gadget();

    @GET
    Call<MainArray> getImagess(@Url String url);

}
