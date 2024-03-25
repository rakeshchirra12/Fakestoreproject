package com.rakesh.fakestoreproduct.service;

import com.rakesh.fakestoreproduct.model.FakeProductDTO;
import com.rakesh.fakestoreproduct.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeProductServiceImpl implements ProductService {

    RestTemplate restTemplate;

    public FakeProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product getProductFromDTO(FakeProductDTO fakeProductDTO) {
        return new Product(fakeProductDTO);
    }

    @Override
    public Product getProduct(Long id) {
        FakeProductDTO fakeProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductDTO.class);
        return getProductFromDTO(fakeProductDTO);
    }

    @Override
    public Product createproduct(Product product) {
        return null;
    }

    @Override
    public Product updateproduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
