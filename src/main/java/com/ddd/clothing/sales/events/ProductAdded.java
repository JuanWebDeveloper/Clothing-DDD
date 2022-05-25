package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.inventory.valueObjects.*;

public class ProductAdded extends DomainEvent {
    private final ProductID productID;
    private final InventoryName inventoryName;
    private final ProductDescription productDescription;
    private final PriceProduct priceProduct;
    private final QuantityProducts quantityProducts;

    public ProductAdded(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        super("clothing.inventory.ProductAdded");
        this.productID = productID;
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
        this.quantityProducts = quantityProducts;
    }

    public ProductID getProductID() {
        return productID;
    }

    public InventoryName getInventoryName() {
        return inventoryName;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public PriceProduct getPriceProduct() {
        return priceProduct;
    }

    public QuantityProducts getQuantityProducts() {
        return quantityProducts;
    }
}
