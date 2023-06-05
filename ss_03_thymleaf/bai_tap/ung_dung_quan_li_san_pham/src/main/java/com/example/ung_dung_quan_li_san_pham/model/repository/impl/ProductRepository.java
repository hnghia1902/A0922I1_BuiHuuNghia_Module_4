package com.example.ung_dung_quan_li_san_pham.model.repository.impl;

import com.example.ung_dung_quan_li_san_pham.model.Product;
import com.example.ung_dung_quan_li_san_pham.model.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
        productList.add(new Product(0,"ビジネス日本語の本",90000,"ない","鈴木"));
        productList.add(new Product(1,"皆の日本語",67000,"初級","織田"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public boolean create(Product product) {
        productList.add(product);
        return true;
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public boolean update(Product product) {
        productList.set(product.getId(),product);
        return true;
    }
}
