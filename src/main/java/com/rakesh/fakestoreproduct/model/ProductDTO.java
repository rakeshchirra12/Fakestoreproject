package com.rakesh.fakestoreproduct.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
