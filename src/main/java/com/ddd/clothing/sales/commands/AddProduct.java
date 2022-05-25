package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.inventory.valueObjects.*;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class AddProduct extends Command {
    private final SalesID salesID;
    private final ProductID productID;
    private final InventoryName inventoryName;
    private final ProductDescription productDescription;
    private final PriceProduct priceProduct;
    private final QuantityProducts quantityProducts;

    public AddProduct(SalesID salesID, ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        this.salesID = salesID;
        this.productID = productID;
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
        this.quantityProducts = quantityProducts;
    }

    public SalesID getSalesID() {
        return salesID;
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
