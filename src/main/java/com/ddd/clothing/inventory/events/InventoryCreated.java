package com.ddd.clothing.inventory.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.inventory.valueObjects.InventoryID;

public class InventoryCreated extends DomainEvent {
    private final InventoryID inventoryID;

    public InventoryCreated(InventoryID inventoryID) {
        super("clothing.inventory.InventoryCreated");
        this.inventoryID = inventoryID;
    }

    public InventoryID getInventoryID() {
        return this.inventoryID;
    }
}
