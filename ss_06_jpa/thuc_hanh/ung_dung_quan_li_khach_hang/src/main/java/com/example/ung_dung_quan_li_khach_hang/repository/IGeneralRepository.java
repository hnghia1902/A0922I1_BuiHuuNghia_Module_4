package com.example.ung_dung_quan_li_khach_hang.repository;

import java.util.List;

public interface IGeneralRepository<T>{
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
