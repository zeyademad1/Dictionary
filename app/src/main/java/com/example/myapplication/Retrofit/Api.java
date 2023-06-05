package com.example.myapplication.Retrofit;

import com.example.myapplication.Models.ApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("/entries/en/{word}")
    Call<List<ApiResponse>> getResponse(
            @Path("word") String word
    );
}
