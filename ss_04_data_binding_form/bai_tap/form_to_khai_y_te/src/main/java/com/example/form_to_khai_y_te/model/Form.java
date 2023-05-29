package com.example.form_to_khai_y_te.model;

import java.util.Date;

public class Form {
    private String ho_ten;
    private Date ngay_sinh;
    private String gioitinh;
    private String so_dien_thoai;

    public Form() {
    }

    public Form(String ho_ten, Date ngay_sinh, String gioitinh, String so_dien_thoai) {
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.gioitinh = gioitinh;
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }
}
