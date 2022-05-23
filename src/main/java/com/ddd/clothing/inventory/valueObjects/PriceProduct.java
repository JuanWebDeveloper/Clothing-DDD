package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class PriceProduct implements ValueObject<Double> {
    private final Double priceProduct;

    public PriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public Double value() {
        return this.getPriceProduct();
    }
}
