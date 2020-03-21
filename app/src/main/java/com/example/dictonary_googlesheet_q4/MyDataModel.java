package com.example.dictonary_googlesheet_q4;

public class MyDataModel {

    private String name;

    private String Meaning ;
    private String synonyms ;


    public String getName() {
        return name;
    }

    public String getMeaning() {
        return Meaning;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeaning(String meaning) {
        Meaning = meaning;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }
}
