package com.example.eatx.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired private ProductsRepository productRepo;
    public List<Products> products;
    public List<Products> listAll()
    {
        return (List<Products>) productRepo.findAll();
    }

    public Products getProductById(Long id) {
        return productRepo.findById(id).get();
    }


    public Products save(Products product) {
        return productRepo.save(product);
    }

    public List<Products> findAll() {
        return this.products;
    }

    public Products find(String id) {
        for (Products product : this.products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
