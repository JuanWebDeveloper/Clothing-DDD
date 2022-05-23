package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class QuantityProducts implements ValueObject<Integer> {
    private final Integer quantityProducts;

    public QuantityProducts(Integer quantityProducts) {
        this.quantityProducts = quantityProducts;
    }

    public Integer getQuantityProducts() {
        return quantityProducts;
    }

    @Override
    public Integer value() {
        return this.getQuantityProducts();
    }
}
