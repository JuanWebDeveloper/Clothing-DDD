package com.ddd.clothing.shipments.entities;

import co.com.sofka.domain.generic.Entity;

// Imports of the inventory
import com.ddd.clothing.inventory.valueObjects.InventoryName;
import com.ddd.clothing.inventory.valueObjects.ProviderPhone;

// Value objects import
import com.ddd.clothing.shipments.valueObjects.DomiciliaryID;

public class Domiciliary extends Entity<DomiciliaryID> {
    protected InventoryName inventoryName;
    protected ProviderPhone providerPhone;

    public Domiciliary(DomiciliaryID domiciliaryID, InventoryName inventoryName, ProviderPhone providerPhone) {
        super(domiciliaryID);
        this.inventoryName = inventoryName;
        this.providerPhone = providerPhone;
    }

    public InventoryName getInventoryName() {
        return inventoryName;
    }

    public ProviderPhone getProviderPhone() {
        return providerPhone;
    }
}
