package com.example.ung_dung_quan_li_san_pham.model.service.impl;

import com.example.ung_dung_quan_li_san_pham.model.Product;
import com.example.ung_dung_quan_li_san_pham.model.repository.IProductRepository;
import com.example.ung_dung_quan_li_san_pham.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean create(Product product) {
        return productRepository.create(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean update(Product product) {
        productRepository.update(product);
        return true;
    }
}
