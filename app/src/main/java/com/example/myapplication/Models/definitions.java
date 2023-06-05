package com.example.myapplication.Models;

import java.util.List;

public class definitions {
    private String definition;

    private List<String> synonyms;

    private List<String> antonyms;

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }

    private String example;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }


    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
