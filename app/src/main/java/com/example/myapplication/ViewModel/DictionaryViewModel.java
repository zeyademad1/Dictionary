package com.example.myapplication.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.Models.ApiResponse;
import com.example.myapplication.Repository.DicRepository;

import java.io.IOException;
import java.util.List;

public class DictionaryViewModel extends ViewModel {
    private DicRepository dicRepository;

    public LiveData<List<ApiResponse>> getDefinition(String word) throws IOException {
        return dicRepository.fetchDefinitionLiveData(word);
    }
}
