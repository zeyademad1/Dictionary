package com.example.myapplication.Models;

import java.util.List;

public class ApiResponse {
    private String word ;
    private List<phonetics> phonetics;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<com.example.myapplication.Models.phonetics> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<com.example.myapplication.Models.phonetics> phonetics) {
        this.phonetics = phonetics;
    }
}
