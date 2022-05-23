package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class ProductID extends Identity {
    private ProductID(String id) {
        super(id);
    }

    public ProductID() {}

    public static ProductID of(String id) {
        return new ProductID(id);
    }
}
