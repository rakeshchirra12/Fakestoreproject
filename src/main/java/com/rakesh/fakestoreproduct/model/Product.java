package com.rakesh.fakestoreproduct.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    public Product(ProductDTO productDTO) {
        this.id = productDTO.getId();
        this.title = productDTO.getTitle();
        this.description = productDTO.getDescription();
        this.price = productDTO.getPrice();
        this.image = productDTO.getImage();
        this.category = new Category(productDTO.getCategory());
    }

    public Product() {
    }

    private long id;
    private String title;
    private Double price;
    private Category category;
    private String description;
    private String image;
}
