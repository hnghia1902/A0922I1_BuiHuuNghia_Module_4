package com.example.emal_setting.config.model;

public class Languages {
    private int languages_id;
    private String languages_name;

    public Languages() {
    }

    public Languages(int languages_id, String languages_name) {
        this.languages_id = languages_id;
        this.languages_name = languages_name;
    }

    public int getLanguages_id() {
        return languages_id;
    }

    public void setLanguages_id(int languages_id) {
        this.languages_id = languages_id;
    }

    public String getLanguages_name() {
        return languages_name;
    }

    public void setLanguages_name(String languages_name) {
        this.languages_name = languages_name;
    }
}
