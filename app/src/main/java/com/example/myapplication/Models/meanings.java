package com.example.myapplication.Models;

import java.util.List;

public class meanings {

    private String partOfSpeech;

    private List<definitions> definitions;


    private String example;


    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<definitions> definitions) {
        this.definitions = definitions;
    }


    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
