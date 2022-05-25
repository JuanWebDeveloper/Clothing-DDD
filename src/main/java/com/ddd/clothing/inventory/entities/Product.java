package com.ddd.clothing.inventory.entities;

import co.com.sofka.domain.generic.Entity;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.*;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity<ProductID> {
    protected InventoryName inventoryName;
    protected ProductDescription productDescription;
    protected PriceProduct priceProduct;
    protected QuantityProducts quantityProducts;
    protected ProviderID providerID;
    private List<Product> inventoryProducts = new ArrayList<>();

    public Product(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct) {
        super(productID);
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
    }

    // Product to Order
    public Product(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        super(productID);
        this.inventoryName = inventoryName;
        this.productDescription = productDescription;
        this.priceProduct = priceProduct;
        this.quantityProducts = quantityProducts;
    }

    // Product for inventory
    public Product(ProductID productID, InventoryName inventoryName, ProviderID providerID) {
        super(productID);
        this.inventoryName = inventoryName;
        this.providerID = providerID;
    }

    public Product(ProductID productID) {
        super(productID);
    }

    // Show The Entity Properties
    public InventoryName InventoryName() {
        return inventoryName;
    }

    public ProductDescription ProductDescription() {
        return productDescription;
    }

    public PriceProduct PriceProduct() {
        return priceProduct;
    }

    public QuantityProducts QuantityProducts() {
        return quantityProducts;
    }

    public List<Product> InventoryProducts() {
        return inventoryProducts;
    }
}
