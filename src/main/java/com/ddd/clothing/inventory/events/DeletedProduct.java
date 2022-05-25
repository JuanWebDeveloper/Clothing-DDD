package com.ddd.clothing.inventory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.inventory.valueObjects.ProductID;

public class DeletedProduct extends DomainEvent {
    private final ProductID productID;

    public DeletedProduct(ProductID productID) {
        super("\"clothing.inventory.DeletedProduct");
        this.productID = productID;
    }

    public ProductID getProductID() {
        return productID;
    }
}
