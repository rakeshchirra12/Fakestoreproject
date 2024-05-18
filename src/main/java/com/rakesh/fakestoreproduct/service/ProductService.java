package com.rakesh.fakestoreproduct.service;

import com.rakesh.fakestoreproduct.model.Product;
import com.rakesh.fakestoreproduct.model.ProductDTO;

import java.util.List;

public interface ProductService {
    Product getProduct(Long id);
    Product createproduct(Product product);
    Product updateproduct(Long id, ProductDTO productDTO);
    Product replaceProduct(Long id, Product product);
    void deleteProduct(Long id);

    List<Product> getAllProducts();
}
