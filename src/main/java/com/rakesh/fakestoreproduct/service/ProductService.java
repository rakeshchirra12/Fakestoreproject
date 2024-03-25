package com.rakesh.fakestoreproduct.service;

import com.rakesh.fakestoreproduct.model.Product;

public interface ProductService {
    Product getProduct(Long id);
    Product createproduct(Product product);
    Product updateproduct(Long id, Product product);
    Product replaceProduct(Long id, Product product);
    void deleteProduct(Long id);

}
