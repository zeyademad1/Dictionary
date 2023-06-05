package com.example.myapplication.Models;

import java.util.List;

public class phonetics {

    private String text;
    private String audio;

    private List<meanings> meanings;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public List<com.example.myapplication.Models.meanings> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<com.example.myapplication.Models.meanings> meanings) {
        this.meanings = meanings;
    }
}
