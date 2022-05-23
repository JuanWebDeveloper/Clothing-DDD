package com.ddd.clothing.inventory;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

// Entities import
import com.ddd.clothing.inventory.entities.Provider;
import com.ddd.clothing.inventory.entities.Product;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.InventoryID;

import java.util.List;
import java.util.Set;

public class Inventory extends AggregateEvent<InventoryID> {
    protected Set<Provider> providers;
    protected Set<Product> products;

    public Inventory(InventoryID inventoryID) {
        super(inventoryID);
    }

    // Get Event Logs
    public static Inventory from(InventoryID inventoryID, List<DomainEvent> events) {
        Inventory inventory = new Inventory(inventoryID);
        events.forEach(inventory::applyEvent);
        return inventory;
    }
}
