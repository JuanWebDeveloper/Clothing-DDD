package com.ddd.clothing.inventory;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

// Entities import
import com.ddd.clothing.inventory.entities.Provider;
import com.ddd.clothing.inventory.entities.Product;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.*;

// Events import
import com.ddd.clothing.inventory.events.*;

import java.util.List;
import java.util.Objects;

public class Inventory extends AggregateEvent<InventoryID> {
    protected List<Provider> providers;
    protected List<Product> products;

    public Inventory(InventoryID inventoryID) {
        super(inventoryID);
        subscribe(new InventoryEventChange(this));
        appendChange(new InventoryCreated(inventoryID)).apply();
    }

    // Get Event Logs
    public static Inventory from(InventoryID inventoryID, List<DomainEvent> events) {
        Inventory inventory = new Inventory(inventoryID);
        events.forEach(inventory::applyEvent);
        return inventory;
    }

    // Behaviors Of The Aggregate
    public void createProvider(ProviderID providerID, InventoryName inventoryName, ProviderPhone providerPhone, List<Product> products) {
        appendChange(new CreatedProvider(
                Objects.requireNonNull(providerID),
                Objects.requireNonNull(inventoryName),
                Objects.requireNonNull(providerPhone),
                Objects.requireNonNull(products)
        )).apply();
    }

    public void editProvider(ProviderID providerID, InventoryName inventoryName, ProviderPhone providerPhone, List<Product> products) {
        appendChange(new EditedProvider(
                Objects.requireNonNull(providerID),
                Objects.requireNonNull(inventoryName),
                Objects.requireNonNull(providerPhone),
                Objects.requireNonNull(products)
        )).apply();
    }

    public void deleteProvider(ProviderID providerID) {
        appendChange(new DeletedProvider(
                Objects.requireNonNull(providerID)
        )).apply();
    }

    public void createProduct(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct) {
        appendChange(new ProductCreated(
                Objects.requireNonNull(productID),
                Objects.requireNonNull(inventoryName),
                Objects.requireNonNull(productDescription),
                Objects.requireNonNull(priceProduct)
        )).apply();
    }

    public void editProduct(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct) {
        appendChange(new EditedProduct(
                Objects.requireNonNull(productID),
                Objects.requireNonNull(inventoryName),
                Objects.requireNonNull(productDescription),
                Objects.requireNonNull(priceProduct)
        )).apply();
    }

    public void deleteProduct(ProductID productID) {
        appendChange(new DeletedProduct(
                Objects.requireNonNull(productID)
        )).apply();
    }

    // Show The Properties Of The Entities Of The Aggregate
    public List<Provider> Providers() {
        return providers;
    }

    public List<Product> Products() {
        return products;
    }
}
