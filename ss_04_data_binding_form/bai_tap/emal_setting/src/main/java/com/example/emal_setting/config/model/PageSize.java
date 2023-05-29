package com.example.emal_setting.config.model;

public class PageSize {
   private int pageSize_id;
   private int PageSize_size;

    public PageSize() {
    }

    public PageSize(int pageSize_id, int PageSize_size) {
        this.pageSize_id = pageSize_id;
        this.PageSize_size = PageSize_size;
    }

    public int getPageSize_id() {
        return pageSize_id;
    }

    public void setPageSize_id(int pageSize_id) {
        this.pageSize_id = pageSize_id;
    }

    public int getPageSize_size() {
        return PageSize_size;
    }

    public void setPageSize_size(int pageSize_size) {
        this.PageSize_size = pageSize_size;
    }
}
