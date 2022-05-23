package com.ddd.clothing.inventory.entities;

import co.com.sofka.domain.generic.Entity;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.ProductID;
import com.ddd.clothing.inventory.valueObjects.InventoryName;
import com.ddd.clothing.inventory.valueObjects.ProductDescription;
import com.ddd.clothing.inventory.valueObjects.PriceProduct;
import com.ddd.clothing.inventory.valueObjects.QuantityProducts;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity<ProductID> {
    protected InventoryName inventoryName;
    protected ProductDescription productDescription;
    protected PriceProduct priceProduct;
    protected QuantityProducts quantityProducts;
    private List<Product> inventoryProducts = new ArrayList<>();

    public Product(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        super(productID);
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
        this.quantityProducts = quantityProducts;
    }
}
