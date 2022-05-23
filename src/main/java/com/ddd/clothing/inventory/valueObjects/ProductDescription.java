package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ProductDescription implements ValueObject<String> {
    private final String productDescription;

    public ProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String value() {
        return this.productDescription;
    }
}
