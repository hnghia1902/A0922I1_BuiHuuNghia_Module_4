package com.example.emal_setting.config.model;

import java.util.Objects;

public class Setting {
    private int id;
    private Languages languages;
    private PageSize pageSize;
    private boolean spam_filter;
    private String signature;

    public Setting() {
    }

    public Setting(int id, Languages languages, PageSize pageSize, boolean spam_filter, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spam_filter = spam_filter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    public void setPageSize(PageSize pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpam_filter() {
        return spam_filter;
    }

    public void setSpam_filter(boolean spam_filter) {
        this.spam_filter = spam_filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
