package com.example.ung_dung_quan_li_san_pham.model.repository;

import com.example.ung_dung_quan_li_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    boolean create(Product product);
    Product findById(int id);
    boolean update(Product product);
}
