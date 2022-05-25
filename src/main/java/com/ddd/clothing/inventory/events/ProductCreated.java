package com.ddd.clothing.inventory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.inventory.valueObjects.InventoryName;
import com.ddd.clothing.inventory.valueObjects.PriceProduct;
import com.ddd.clothing.inventory.valueObjects.ProductDescription;
import com.ddd.clothing.inventory.valueObjects.ProductID;

public class ProductCreated extends DomainEvent {
    private final ProductID productID;
    private final InventoryName inventoryName;
    private final ProductDescription productDescription;
    private final PriceProduct priceProduct;

    public ProductCreated(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct) {
        super("clothing.inventory.ProductCreated");
        this.productID = productID;
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
    }

    public ProductID getProductID() {
        return this.productID;
    }

    public InventoryName getInventoryName() {
        return this.inventoryName;
    }

    public ProductDescription getProductDescription() {
        return this.productDescription;
    }

    public PriceProduct getPriceProduct() {
        return this.priceProduct;
    }

}
