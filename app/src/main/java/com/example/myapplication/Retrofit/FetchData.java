package com.example.myapplication.Retrofit;

import com.example.myapplication.Models.ApiResponse;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FetchData {
    private static final String BASE_URL = "https://api.dictionaryapi.dev/api/v2";

    private final Retrofit retrofit;
    private static FetchData instance;
    private Api api;

    private FetchData() {

        // For secure Http connection
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(50, TimeUnit.SECONDS)
                .readTimeout(50, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);


    }


    // Singleton Pattern with lazy initialization
    public static FetchData getInstance() {
        if (instance == null) {
            synchronized (FetchData.class) {
                if (instance == null) {
                    instance = new FetchData();
                }
            }
        }
        return instance;
    }

    public Call<List<ApiResponse>> getDefinition(String word) throws IOException {
        if (word.isEmpty() || word == null) {
            throw new IllegalArgumentException("Word Can't be empty or null");
        }

        Call<List<ApiResponse>> call = api.getResponse(word);
        Response<List<ApiResponse>> response = call.execute();
        if (response.isSuccessful()) {
            return call;
        } else
            throw new IOException("Error getting definition: " + response.code());
    }


}

