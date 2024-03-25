package com.rakesh.fakestoreproduct.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    public Product(FakeProductDTO fakeProductDTO) {
        this.id = fakeProductDTO.getId();
        this.title = fakeProductDTO.getTitle();
        this.description = fakeProductDTO.getDescription();
        this.price = fakeProductDTO.getPrice();
        this.image = fakeProductDTO.getImage();
        this.category = new Category(fakeProductDTO.getCategory());
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
