package com.example.myapplication.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.Models.ApiResponse;
import com.example.myapplication.Retrofit.FetchData;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;
import java.io.IOException;
import java.util.List;



public class DicRepository {


    /* Fetches the definition of a word and returns a LiveData object containing the response.
 * @param word the word to search for
 * @return LiveData<List<ApiResponse>> object containing the response
 * @throws IOException if there is an error with the network connection
 */
public LiveData<List<ApiResponse>> fetchDefinitionLiveData(String word) throws IOException {
    if (word == null || word.isEmpty()) {
        throw new IllegalArgumentException("Word cannot be null or empty");
    }
     MutableLiveData<List<ApiResponse>> liveData = new MutableLiveData<>();
    FetchData fetchData = FetchData.getInstance();
     fetchData.getDefinition(word).enqueue(new Callback<List<ApiResponse>>() {
        @Override
        public void onResponse(Call<List<ApiResponse>> call, Response<List<ApiResponse>> response) {
            if (response.isSuccessful() && response.body() != null) {
                liveData.setValue(response.body());
            } else {
                liveData.setValue(null);
            }
        }
         @Override
        public void onFailure(Call<List<ApiResponse>> call, Throwable t) {
            liveData.setValue(null);
        }
    });
     if (liveData.getValue() == null) {
        throw new IOException("Error fetching definition for word: " + word);
    }
     return liveData;
}
}
