package com.rakesh.fakestoreproduct.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    public Category() {
    }
    public Category(String name) {
        this.name = name;
    }

    private long id;
    private String name;
}
