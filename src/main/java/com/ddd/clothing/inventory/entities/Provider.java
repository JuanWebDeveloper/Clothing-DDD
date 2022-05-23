package com.ddd.clothing.inventory.entities;

import co.com.sofka.domain.generic.Entity;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.ProviderID;
import com.ddd.clothing.inventory.valueObjects.InventoryName;
import com.ddd.clothing.inventory.valueObjects.ProviderPhone;

import java.util.List;

public class Provider extends Entity<ProviderID> {
    protected InventoryName inventoryName;
    protected ProviderPhone providerPhone;
    protected List<Product> products;

    public Provider(ProviderID providerID, InventoryName inventoryName, ProviderPhone providerPhone, List<Product> products) {
        super(providerID);
        this.inventoryName = inventoryName;
        this.providerPhone = providerPhone;
        this.products = products;
    }
}
