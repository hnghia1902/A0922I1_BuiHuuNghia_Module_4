package com.example.emal_setting.config.repository;

import java.util.List;

public interface Repository<T> {
    T findById(int id);
    List<T> findAll();
}
