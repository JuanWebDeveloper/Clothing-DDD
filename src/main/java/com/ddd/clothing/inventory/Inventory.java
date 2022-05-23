package com.ddd.clothing.inventory;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Value objects
import com.ddd.clothing.inventory.valueObjects.InventoryID;

public class Inventory extends AggregateEvent<InventoryID> {
    public Inventory(InventoryID inventoryID) {
        super(inventoryID);
    }
}
