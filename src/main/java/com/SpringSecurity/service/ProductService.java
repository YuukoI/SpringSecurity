package com.SpringSecurity.service;

import com.SpringSecurity.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product findById(Long id);

    public Product save(Product product);

    public void delete(Long id);
}
