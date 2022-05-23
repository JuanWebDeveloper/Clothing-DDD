package com.ddd.clothing.inventory;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

// Entities import
import com.ddd.clothing.inventory.entities.Provider;
import com.ddd.clothing.inventory.entities.Product;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.InventoryID;

// Events import
import com.ddd.clothing.inventory.events.InventoryCreated;

import java.util.List;

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

    // Show The Properties Of The Entities Of The Aggregate
    public List<Provider> Providers() {
        return providers;
    }

    public List<Product> Products() {
        return products;
    }
}
