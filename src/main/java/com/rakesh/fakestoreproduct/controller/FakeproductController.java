package com.rakesh.fakestoreproduct.controller;

import com.rakesh.fakestoreproduct.model.Product;
import com.rakesh.fakestoreproduct.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class FakeproductController {

    ProductService productService;

    public FakeproductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.getProduct(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createproduct(product);
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable long id, @RequestBody Product product) {
        return productService.replaceProduct(id, product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product) {
        return productService.updateproduct(id, product);
    }
}
