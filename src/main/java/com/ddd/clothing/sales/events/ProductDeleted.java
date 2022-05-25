package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.inventory.valueObjects.ProductID;

public class ProductDeleted extends DomainEvent {
    private final ProductID productID;

    public ProductDeleted(ProductID productID) {
        super("clothing.inventory.ProductDeleted");
        this.productID = productID;
    }

    public ProductID getProductID() {
        return productID;
    }
}
