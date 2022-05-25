package com.ddd.clothing.inventory.events;

import co.com.sofka.domain.generic.DomainEvent;

// Value objects import
import com.ddd.clothing.inventory.valueObjects.ProviderID;
import com.ddd.clothing.inventory.valueObjects.InventoryName;
import com.ddd.clothing.inventory.valueObjects.ProviderPhone;

// Product entity import
import com.ddd.clothing.inventory.entities.Product;

import java.util.List;

public class CreatedProvider extends DomainEvent {
    private final ProviderID providerID;
    private final InventoryName inventoryName;
    private final ProviderPhone providerPhone;
    private  final List<Product> products;

    public CreatedProvider(ProviderID providerID, InventoryName inventoryName, ProviderPhone providerPhone, List<Product> products) {
        super("clothing.inventory.CreatedProvider");
        this.providerID = providerID;
        this.inventoryName = inventoryName;
        this.providerPhone = providerPhone;
        this.products = products;
    }

    public ProviderID getProviderID() {
        return this.providerID;
    }

    public InventoryName getInventoryName() {
        return this.inventoryName;
    }

    public ProviderPhone getProviderPhone() {
        return this.providerPhone;
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
